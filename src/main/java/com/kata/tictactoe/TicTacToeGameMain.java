package com.kata.tictactoe;

import java.util.Scanner;

public class TicTacToeGameMain {

    private static final String PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION = "Player O plays on the played position.";
    private static final String PLAYER_X_PLAYS_ON_THE_PLAYED_POSITION = "Player X plays on the played position.";
    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String PLEASE_RE_ENTER_THE_POSITION = " Please re-enter the position..";
    private static final String ENTER_YOUR_PLACEMENT_1_TO_9 = "Enter your placement (1 to 9) ::";

    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        TicTacToeGame ticTacToeGame = new TicTacToeGame(ticTacToeBoard);

        ticTacToeBoard.displayBoard();

        while(true) {
            System.out.println(ENTER_YOUR_PLACEMENT_1_TO_9);
            int[] boardIndex;
            try {
                boardIndex = ticTacToeBoard.getBoardIndex(new Scanner(System.in).nextInt());
            } catch (InvalidPositionException ex) {
                System.out.println(ex.getMessage() + PLEASE_RE_ENTER_THE_POSITION);
                continue;
            }

            String message = ticTacToeGame.playGame(boardIndex[0], boardIndex[1]);
            ticTacToeBoard.displayBoard();

            if (message.equals(GAME_IS_CONTINUE)) {
                continue;
            } else if (message.equals(PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION)
                    || message.equals(PLAYER_X_PLAYS_ON_THE_PLAYED_POSITION)) {
                System.out.println(message+ PLEASE_RE_ENTER_THE_POSITION);
                continue;
            }
            System.out.println(message);
            break;
        }
    }
}
