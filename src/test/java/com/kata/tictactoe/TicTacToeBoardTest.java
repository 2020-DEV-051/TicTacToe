package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf3AfterDeclaration() {
        assertThat(ticTacToeBoard.box.length, is(3));
    }

    @Test
    public void ticTacToeBoardShouldReturnXAtIndex_02_WhenSetValueIsXAtIndex_02() {
        ticTacToeBoard.setValue(0,2, 'X');
        assertThat(ticTacToeBoard.box[0][2], is('X'));
    }

    @Test
    public void ticTacToeBoardShouldGetOAtIndex_20_WhenSetValueIsOAtThatIndex() {
        ticTacToeBoard.setValue(2,0, 'O');
        assertThat(ticTacToeBoard.getValue(2, 0), is('O'));
    }

    @Test
    public void ticTacToeBoardShouldGetXAtIndex_20_WhenSetValueIsXAtThatIndex() {
        ticTacToeBoard.setValue(2,0, 'X');
        assertThat(ticTacToeBoard.getValue(2, 0), is('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenPlayerXPlaysOnPlayedPositionSay_11(){
        ticTacToeBoard.setValue(1,1, 'X');
        assertTrue(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseWhenPlayerXDoesNotPlayOnPlayedPositionSay_11(){
        assertFalse(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenPlayerOPlaysOnPlayedPositionSay_11(){
        ticTacToeBoard.setValue(1,1, 'O');
        assertTrue(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstRowIsFullOfO() {
        ticTacToeBoard.setValue(0,0, 'O');
        ticTacToeBoard.setValue(0,1, 'O');
        ticTacToeBoard.setValue(0,2, 'O');
        assertTrue(ticTacToeBoard.isAnyOfRowFullOfEitherXOrO(0, 'O'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstRowIsNotFullOfO() {
        ticTacToeBoard.setValue(0,0, 'O');
        ticTacToeBoard.setValue(0,1, 'X');
        ticTacToeBoard.setValue(0,2, 'O');
        assertFalse(ticTacToeBoard.isAnyOfRowFullOfEitherXOrO(0, 'O'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstColumnIsFullOfX() {
        ticTacToeBoard.setValue(0,0, 'X');
        ticTacToeBoard.setValue(1,0, 'X');
        ticTacToeBoard.setValue(2,0, 'X');
        assertTrue(ticTacToeBoard.isFirstColumnFullOfX(0, 'X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstColumnIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0, 'X');
        ticTacToeBoard.setValue(1,0, 'O');
        ticTacToeBoard.setValue(2,0, 'X');
        assertFalse(ticTacToeBoard.isFirstColumnFullOfX(0, 'X'));
    }
}
