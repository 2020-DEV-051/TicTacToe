package com.kata.tictactoe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private static final char O = 'O';
    private static final char X = 'X';
    private TicTacToeBoard ticTacToeBoard;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLengthOf3AfterDeclaration() {
        assertThat(ticTacToeBoard.box.length, is(3));
    }

    @Test
    public void ticTacToeBoardShouldReturnXAtIndex_02_WhenSetValueIsXAtIndex_02() {
        ticTacToeBoard.setValue(0,2, X);
        assertThat(ticTacToeBoard.box[0][2], is(X));
    }

    @Test
    public void ticTacToeBoardShouldGetOAtIndex_20_WhenSetValueIsOAtThatIndex() {
        ticTacToeBoard.setValue(2,0, O);
        assertThat(ticTacToeBoard.getValue(2, 0), is(O));
    }

    @Test
    public void ticTacToeBoardShouldGetXAtIndex_20_WhenSetValueIsXAtThatIndex() {
        ticTacToeBoard.setValue(2,0, X);
        assertThat(ticTacToeBoard.getValue(2, 0), is(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenPlayerXPlaysOnPlayedPositionSay_11(){
        ticTacToeBoard.setValue(1,1, X);
        assertTrue(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseWhenPlayerXDoesNotPlayOnPlayedPositionSay_11(){
        assertFalse(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueWhenPlayerOPlaysOnPlayedPositionSay_11(){
        ticTacToeBoard.setValue(1,1, O);
        assertTrue(ticTacToeBoard.isPlayedPosition(1, 1));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstRowIsFullOfO() {
        ticTacToeBoard.setValue(0,0, O);
        ticTacToeBoard.setValue(0,1, O);
        ticTacToeBoard.setValue(0,2, O);
        assertTrue(ticTacToeBoard.isAnyOfRowFullOfEitherXOrO(0, O));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstRowIsNotFullOfO() {
        ticTacToeBoard.setValue(0,0, O);
        ticTacToeBoard.setValue(0,1, X);
        ticTacToeBoard.setValue(0,2, O);
        assertFalse(ticTacToeBoard.isAnyOfRowFullOfEitherXOrO(0, O));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstColumnIsFullOfX() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(1,0, X);
        ticTacToeBoard.setValue(2,0, X);
        assertTrue(ticTacToeBoard.isAnyOfColumnFullOfEitherXOrO(0, X));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstColumnIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(1,0, O);
        ticTacToeBoard.setValue(2,0, X);
        assertFalse(ticTacToeBoard.isAnyOfColumnFullOfEitherXOrO(0, X));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFirstDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,2, X);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(2,0, X);
        assertTrue(ticTacToeBoard.isFirstDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfFirstDiagonalIsNotFullOfX() {
        ticTacToeBoard.setValue(0,2, X);
        ticTacToeBoard.setValue(1,1, O);
        ticTacToeBoard.setValue(2,0, X);
        assertFalse(ticTacToeBoard.isFirstDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfSecondDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(2,2, X);
        assertTrue(ticTacToeBoard.isSecondDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfSecondDiagonalIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(2,2, O);
        assertFalse(ticTacToeBoard.isSecondDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherDiagonalIsFullOfX() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(2,2, X);
        assertTrue(ticTacToeBoard.isEitherDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfEitherDiagonalIsNotFullOfX() {
        ticTacToeBoard.setValue(0,0, O);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(2,2, X);
        assertFalse(ticTacToeBoard.isEitherDiagonalFullOfEitherXOrO(X));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfFull() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(0,1, O);
        ticTacToeBoard.setValue(0,2, X);
        ticTacToeBoard.setValue(1,0, O);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(1,2, O);
        ticTacToeBoard.setValue(2,1, X);
        ticTacToeBoard.setValue(2,0, O);
        ticTacToeBoard.setValue(2,2, X);
        assertTrue(ticTacToeBoard.isBoardFull());
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfNotFull() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.setValue(0,1, O);
        ticTacToeBoard.setValue(0,2, X);
        ticTacToeBoard.setValue(1,0, O);
        ticTacToeBoard.setValue(1,1, X);
        ticTacToeBoard.setValue(1,2, O);
        ticTacToeBoard.setValue(2,1, X);
        ticTacToeBoard.setValue(2,0, O);
        assertFalse(ticTacToeBoard.isBoardFull());
    }

    @Test
    public void ticTacToeBoardShouldBeDisplayedWithHyphenSymbolsBeforeGameStarts() {
        ticTacToeBoard.displayBoard();
        assertThat(outContent.toString(), is("---\r\n---\r\n---\r\n"));
    }

    @Test
    public void ticTacToeBoardShouldBeDisplayedWithXAtIndex_00IfXIsSetAtThatIndex() {
        ticTacToeBoard.setValue(0,0, X);
        ticTacToeBoard.displayBoard();
        assertThat(outContent.toString(), is("X--\r\n---\r\n---\r\n"));
    }

    @Test
    public void ticTacToeBoardShouldReturnIntArrayOfIndex_00_ForPosition1() throws InvalidPositionException {
        assertThat(ticTacToeBoard.getBoardIndex(1), is(new int[]{0,0}));
    }

    @Test
    public void ticTacToeBoardShouldReturnIntArrayOfIndex_01_ForPosition2() throws InvalidPositionException {
        assertThat(ticTacToeBoard.getBoardIndex(2), is(new int[]{0,1}));
    }

    @Test
    public void ticTacToeBoardShouldReturnIntArrayOfIndex_22_ForPosition9() throws InvalidPositionException {
        assertThat(ticTacToeBoard.getBoardIndex(9), is(new int[]{2,2}));
    }

    @Test(expected = InvalidPositionException.class)
    public void ticTacToeBoardShouldThrow_InvalidPositionException_IfThePositionIsGreaterThan9() throws InvalidPositionException {
        int [] boardIndex = ticTacToeBoard.getBoardIndex(10);
    }

    @Test(expected = InvalidPositionException.class)
    public void ticTacToeBoardShouldThrow_InvalidPositionException_IfThePositionIsLessThan1() throws InvalidPositionException {
        int [] boardIndex = ticTacToeBoard.getBoardIndex(0);
    }
}
