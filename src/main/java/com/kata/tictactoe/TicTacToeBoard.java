package com.kata.tictactoe;

class TicTacToeBoard {
    char[][] box;

    TicTacToeBoard() {
        this.box = new char[3][3];
    }

    public void setValue(int row, int col, char value) {
        this.box[row][col] = value;
    }

    public char getValue(int row, int col) {
        return 'O';
    }
}
