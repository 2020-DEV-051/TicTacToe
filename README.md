# Tic Tac Toe

## About this Kata

This short and simple Kata should be performed using **Test Driven Development** (TDD).

## Rules

The rules are described below :

- X always goes first.
- Players cannot play on a played position.
- Players alternate placing X’s and O’s on the board until either:
	- One player has three in a row, horizontally, vertically or diagonally
	- All nine squares are filled.
- If a player is able to draw three X’s or three O’s in a row, that player wins.
- If all nine squares are filled and neither player has three in a row, the game is a draw.

# Implementation

## Tic Tac Toe Application

- This Application basically contains a (3*3) board.
- Always Player X plays first, then Player O and, then, both players play alternatively until
  the game finishes.
- Each Player enters the valid position for example 1, 2, etc. and respective position is replaced
  by either X or O depending on Player X or O input.
- The following positions are considered as valid,i.e., 1 --> $(0,0), 2-->$(0,1),
  3--> $(0,2), 4--> $(1,0), 5--> $(1,1), 6--> $(1,2),7--> $(2,0), 8--> $(2,1), 9--> $(2,2)
  and rest other position are considered as Invalid Position.
- If the player plays on the played position, then the position is occupied.Hence, a message
  is displayed as **Player O plays on the played  position.** or
  **Player X plays on the played position.**
  If the position is greater than 9 or less than 1, then the position is invalid.
  If the position is invalid, then a message is displayed on console i.e.,
  **Position is Invalid! Please re-enter the position..**
- If all the valid positions are occupied by the players alternatively, then game is draw.
  If the game is draw, then the message is displayed as **Game is Draw!**
- Either player wins if
      1) First row/Column is occupied by X or O
      2) Second row/column is occupied by X or O
      3) Last row/column is occupied by X or O
      4) Both diagonals are occupied by X or O
  If either player wins the game, then the message is displayed as **Player X Won! or Player O Won!**

# Execution

In order to run the application, follow the below steps,
- Open a terminal window
- Change directory to TicTacToe maven project. You should be in a directory that contains pom.xml file.
- Run the following commands:
    - **mvn clean install**
    - **mvn exec:java -Dexec.mainClass="com.kata.tictactoe.TicTacToeGameMain"**