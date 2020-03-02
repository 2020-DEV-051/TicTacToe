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

    boolean isAnyOfRowFullOfEitherXOrO(int row, char value) {
        return this.getValue(row, 0) == value
                && this.getValue(row, 1) == value
                && this.getValue(row, 2) == value;
    }

    boolean isAnyOfColumnFullOfEitherXOrO(int col, char value) {
        return this.getValue(0, col) == value
                && this.getValue(1, col) == value
                && this.getValue(2, col) == value;
    }

    boolean isFirstDiagonalFullOfEitherXOrO(char value) {
        return this.getValue(0, 2) == value
                && this.getValue(1, 1) == value
                && this.getValue(2, 0) == value;
    }

    boolean isSecondDiagonalFullOfEitherXOrO(char value) {
        return this.getValue(0, 0) == value
                && this.getValue(1, 1) == value
                && this.getValue(2, 2) == value;
    }

    boolean isEitherDiagonalFullOfEitherXOrO(char value) {
        return isFirstDiagonalFullOfEitherXOrO(value)
                || isSecondDiagonalFullOfEitherXOrO(value);
    }

    boolean isBoardFull() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                if (this.getValue(i, j) != X && this.getValue(i, j) != O) {
                    return false;
                }
            }
        }
        return true;
    }
}
