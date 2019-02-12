.PHONY: all

all: dev2-alg-syllabus.pdf dev2-alg-solutionbook.pdf

dev2-alg-syllabus.pdf:
	latexmk -pdf dev2-alg-syllabus

dev2-alg-solutionbook.pdf:
	bash solbook
	latexmk -pdf dev2-alg-solutionbook
