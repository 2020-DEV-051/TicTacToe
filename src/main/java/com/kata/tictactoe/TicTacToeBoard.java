package com.kata.tictactoe;

class TicTacToeBoard {
    private static final char X = 'X';
    private static final char O = 'O';
    char[][] box;

    TicTacToeBoard() {
        this.box = new char[3][3];
    }

    void setValue(int row, int col, char value) {
        this.box[row][col] = value;
    }

    char getValue(int row, int col) {
        return this.box[row][col];
    }

    public boolean isPlayedPosition(int row, int col) {
        return this.getValue(row, col) == X || this.getValue(row,col) == O;
    }
}
