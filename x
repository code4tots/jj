#!/bin/bash

if [ "$1" = "clean" ] || [ "$1" = "c" ]; then
	rm -rf \
		__pycache__ \
		JjLexer.py JjLexer.tokens JjListener.py JjParser.py Jj.tokens \
		*.class
elif [ "$1" = "build" ] || [ "$1" = "b" ]; then
	if [ "$2" ]; then
		java -jar /usr/local/lib/antlr-4.5-complete.jar -Dlanguage=Python3 Jj.g4 && \
		javac JjRuntime.java # && \
		# create_android_project "$2" && (cd "$2" && ant debug)
	else
		echo "Usage: $0 $1 [project-name]"
		exit 1
	fi
elif [ "$1" = "run" ] || [ "$1" = "r" ]; then
	foo=$(basename "$2" .jj)
	foo="$(tr '[:lower:]' '[:upper:]' <<< ${foo:0:1})${foo:1}"
	$0 b $foo && cat "$2" | python3 jj.py simp | java JjRuntime
else
	echo "Unrecognized command '$1'"
	exit 1
fi
