package com.kata.tictactoe;

import java.util.Arrays;
import java.util.List;

class TicTacToeBoard {
    private static final char X = 'X';
    private static final char O = 'O';
    char[][] box;
    private List<int[]> boardIndex = Arrays.asList(new int[][]{
            {0,0},{0,1},{0,2},
            {1,0},{1,1},{1,2},
            {2,0},{2,1},{2,2}});

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

    void displayBoard() {
        for (char[] row : this.box){
            for (char c : row) {
                if (c != X && c != O) {
                    System.out.print('-');
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

    int[] getBoardIndex(int position) {
        switch (position) {
            case 1 :
                return this.boardIndex.get(0);
            case 2 :
                return this.boardIndex.get(1);
            case 9 :
                return this.boardIndex.get(8);
        }
        return null;
    }
}
