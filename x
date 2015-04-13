#!/bin/bash

if [ "$1" = "clean" ] || [ "$1" = "c" ]; then
	rm -rf \
		__pycache__ \
		JjLexer.py JjLexer.tokens JjListener.py JjParser.py Jj.tokens
else
	echo "Unrecognized command '$1'"
	exit 1
fi
