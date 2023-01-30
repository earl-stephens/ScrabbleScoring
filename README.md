# Scrabble Scoring

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction  

This project is based on the Turing School of Software and Development challenge [Scrabble Scoring](https://github.com/turingschool-examples/challenges/blob/master/collections.markdown#2-state-capitals).  I did this challenge in Java in order to practice working with Java HashMaps.

The Scoring class is the heart of the project.  It creates a HashMap of letters (the keys) and Scrabble scores (the values). The `breakUpWord()` method is used to take the user input word and turn it into a char array.  `scores()` takes the char array and iterates through it, finding the value of each letter and creating a sum value for the whole word.

The ScrabbleScores class contains the main method to kick off the game.

The Displayer class contains the methods to control input and output to the user.  It creates a Scoring object.  It prompts the user to input a word, and then does a couple of checks.  If the user enters 1, then the game ends.  If the user enters any other number, then a message prompts the user to enter words with only letters.

## Installation

Clone the repo to your local machine.  Navigate to the files in ScrabbleScoring/src/main.  For each file, perform the following:  
`javac -d . filename.java`


## Getting Started   

To run the program, at the command line type:  
`java -cp . application.ScrabbleScores`

## Further Improvements

JUnit testing for keyboard input and output print statements

## Built With

OpenJDK 16.0.1

JUnit 5  

Eclipse 2020-06  

## Coverage  

78.5%

## Authors

[Earl Stephens](https://github.com/earl-stephens)