package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeGameTest {

    @Test
    public void ticTacToeGameShouldReturn_GameIsContinueMessage_IfDefaultPlayerX_Makes1stMoveAtIndex_00() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Assert.assertThat(ticTacToeGame.playGame(0,0), Is.is("Game is Continue!"));
    }
}
