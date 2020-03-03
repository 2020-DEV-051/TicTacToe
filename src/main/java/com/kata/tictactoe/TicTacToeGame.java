package com.kata.tictactoe;

class TicTacToeGame {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String PLAYER = "Player ";
    private static final String PLAYS_ON_THE_PLAYED_POSITION = " plays on the played position.";
    private static final char X = 'X';
    private static final char O = 'O';
    private static final String GAME_IS_DRAW = "Game is Draw!";
    TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
    private char player = X;

    String playGame(int row, int col) {
        if (ticTacToeBoard.isPlayedPosition(row, col)) {
            return PLAYER +player+ PLAYS_ON_THE_PLAYED_POSITION;
        }
        ticTacToeBoard.setValue(row,col,player);
        if (ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        player = player == X ? O : X;
        return GAME_IS_CONTINUE;
    }
}
