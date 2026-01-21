# CLI Hangman

A simple command-line Hangman game written in Java.

This game runs inside the terminal, It was made as a way for me to practise Java fundamentals like basic project structure and compiling java programs from the CLI

## Requirements

- Java JDK 17 or newer (`java --version`)
- A terminal (Tested on Fedora 43)


## How to Run

### Option 1: Using the `hangman` command (Linux)

Make the launcher script executable and add it to your PATH:


- `chmod +x scripts/hangman`

- `ln -s "$(pwd)/scripts/hangman" ~/.local/bin/hangman`

After running Launcher script just use 
`hangman`


This Compiles and Runs the game automatically

### Option 2: Compile and run manually

From the project root directory, run:
`find src -name "*.java" | xargs javac -d out
`
then:
`java -cp out Main`

## How to Play

- The game chooses a hidden word
- Guess one letter at a time
- Correct guesses reveal letters in the word
- Incorrect guesses reduce remaining attempts
- You win by guessing the full word before attempts run out
- Option for replay appears

## Project Structure

- `src/` — Java source files
- `out/` — Compiled `.class` files

## Notes

This is a simple CLI-based project that doesn't use any external libraries or frameworks and was just made as a way for me to practise the basics of java Development   
