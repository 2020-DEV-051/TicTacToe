package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
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
}
