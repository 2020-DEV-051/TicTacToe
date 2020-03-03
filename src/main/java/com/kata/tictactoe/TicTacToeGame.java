package com.kata.tictactoe;

class TicTacToeGame {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
    private char player = 'X';

    String playGame(int row, int col) {
        if (ticTacToeBoard.isPlayedPosition(row, col)) {
            return "Player "+player+" plays on the played position.";
        }
        ticTacToeBoard.setValue(row,col,player);
        player = player == 'X' ? 'O' : 'X';
        return GAME_IS_CONTINUE;
    }
}
