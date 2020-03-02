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

    boolean isPlayedPosition(int row, int col) {
        return this.getValue(row, col) == X || this.getValue(row,col) == O;
    }

    public boolean isAnyOfRowFullOfEitherXOrO(int row, char value) {
        return this.getValue(row, 0) == value
                && this.getValue(row, 1) == value
                && this.getValue(row, 2) == value;
    }
}
