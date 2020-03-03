package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION = "Player O plays on the played position.";

    @Test
    public void ticTacToeGameShouldReturn_GameIsContinueMessage_IfDefaultPlayerX_Makes1stMoveAtIndex_00() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
    }

    @Test
    public void ticTacToeGameShouldReturn_PositionMessage_IfPlayerOPlaysOnPlayedPosition() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertThat(ticTacToeGame.playGame(0,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,1), is(PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION));
    }
}
