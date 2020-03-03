package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeGameTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION = "Player O plays on the played position.";
    private static final String GAME_IS_DRAW = "Game is Draw!";
    private static final String PLAYER_X_WON = "Player X Won!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
    private TicTacToeGame ticTacToeGame;

    @Before
    public void setUp() {
        ticTacToeGame = new TicTacToeGame(ticTacToeBoard);
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsContinueMessage_IfDefaultPlayerX_Makes1stMoveAtIndex_00() {
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
    }

    @Test
    public void ticTacToeGameShouldReturn_PositionMessage_IfPlayerOPlaysOnPlayedPosition() {
        assertThat(ticTacToeGame.playGame(0,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,1), is(PLAYER_O_PLAYS_ON_THE_PLAYED_POSITION));
    }

    @Test
    public void ticTacToeGameShouldReturn_GameIsDrawMessage_IfThePlayersMoveAlternativelyUntilGameIsDraw() {
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,2), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,2), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,2), is(GAME_IS_DRAW));
    }

    @Test
    public void ticTacToeGameShouldReturn_WinningMessage_IfPlayerXCompletesFirstRow() {
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,2), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(0,1), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeGameShouldReturn_WinningMessage_IfPlayerXCompletesFirstColumn() {
        assertThat(ticTacToeGame.playGame(0,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,0), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesFirstDiagonal() {
        assertThat(ticTacToeGame.playGame(0,2), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,0), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,1), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(1,2), is(GAME_IS_CONTINUE));
        assertThat(ticTacToeGame.playGame(2,0), is(PLAYER_X_WON));
    }
}
