package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";

    @Test
    public void ticTacToeGameShouldReturn_GameIsContinueMessage_IfDefaultPlayerX_Makes1stMoveAtIndex_00() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
    }
}
