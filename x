#!/bin/bash

# source this from your bashrc.

### CUSTOMIZABLE VARIABLES

PATH_TO_JJ=~/git/hub/jj
PATH_TO_ANTLR4=/usr/local/lib/antlr-4.5-complete.jar
PATH_TO_ANDROID_SDK=~/git/pkg/android-sdk-linux

### END CUSTOMIZATIONS

capitalize() {
	echo $(tr '[:lower:]' '[:upper:]' <<< ${1:0:1})${1:1}
}

lowercase() {
	echo $1 | tr '[:upper:]' '[:lower:]'
}

jj_build() {
	(cd $PATH_TO_JJ && java -jar $PATH_TO_ANTLR4 -Dlanguage=Python3 Jj.g4)
}

jj_clean() {
	(cd $PATH_TO_JJ && rm -rf \
		__pycache__ \
		JjLexer.py JjLexer.tokens JjListener.py JjParser.py Jj.tokens \
		*.class)
}

create_android_project() {
	$PATH_TO_ANDROID_SDK/tools/android create project \
		--target "android-22" \
		--path ./"$1" \
		--package com.mtots.jj \
		--activity MainActivity
}

create_project() {
	([ -d "$1" ] || create_android_project "$1") && \
	cp $PATH_TO_JJ/JjRuntime.java "$1"/src/com/mtots/jj/ && \
	cp $PATH_TO_JJ/MainActivity.java "$1"/src/com/mtots/jj/
}

jj_run() {
	if ! [[ "$1" = *.jj ]]; then
		echo "filename must end in .jj"
		return 1
	fi
	local base=$(basename "$1" .jj) && \
	local name=$(capitalize $base) && \
	(cd $PATH_TO_JJ && ([ -f JjParser.py ] || jj_build)) && \
	create_project $name && \
	cat Script.java | sed s/%s/"$(cat "$1" | (cd $PATH_TO_JJ && python3 jj.py simp))"/ > "$name"/src/com/mtots/jj/Script.java && \
	(cd $name && ant debug && ant -d installd)
}
