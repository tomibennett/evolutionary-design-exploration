package Bingo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// what are the concepts here
// a board
// numbers
// marking and unmarking
// winning and so


// TODOs
// - [ ] abstract number ?
// - [ ] marked number method for builder ?
public class GameTest {
    // introducing numbers
    @Test
    void boardWithNumber3IsBoardWithNumber3() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {

        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {

        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .withNumber(BingoNumber.fromString("2987"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .withNumber(BingoNumber.fromString("2987"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("39"))
            .build();
        final var numberDrawn = BingoNumber.fromString("39");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(numberDrawn.mark())
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("92"))
            .withNumber(BingoNumber.fromString("1234"))
            .build();
        final var numberDrawn = BingoNumber.fromString("92");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(numberDrawn.mark())
            .withNumber(BingoNumber.fromString("1234"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("38"))
            .withNumber(BingoNumber.fromString("26"))
            .build();
        final var numberDrawn = BingoNumber.fromString("26");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("38"))
            .withNumber(numberDrawn.mark())
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(BingoNumber.fromString("85"))
            .withNumber(BingoNumber.fromString("246"))
            .build();
        final var numberDrawn = BingoNumber.fromString("23");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(numberDrawn.mark())
            .withNumber(BingoNumber.fromString("85"))
            .withNumber(BingoNumber.fromString("246"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(BingoNumber.fromString("85"))
            .withNumber(BingoNumber.fromString("246"))
            .build();
        final var numberDrawn = BingoNumber.fromString("85");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(numberDrawn.mark())
            .withNumber(BingoNumber.fromString("246"))
            .build();

        assertEquals(expected, board);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(BingoNumber.fromString("85"))
            .withNumber(BingoNumber.fromString("246"))
            .build();
        final var numberDrawn = BingoNumber.fromString("246");

        board.mark(numberDrawn);

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(BingoNumber.fromString("85"))
            .withNumber(numberDrawn.mark())
            .build();

        assertEquals(expected, board);
    }

    // introducing winning/loosing concept
    @Test
    void aOneNumberBoardWithNoMarkedNumberLooses() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndOneColumnBoard(board);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.looses(), actual);
    }

    @Test
    void aOneNumberBoardWithOneMarkedNumberWins() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23").mark())
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndOneColumnBoard(board);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.wins(), actual);
    }

    @Test
    void aTwoNumbersBoardWithItsFirstNumberMarkedAndItsSecondNumberUnmarkedLooses() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23").mark())
            .withNumber(BingoNumber.fromString("135"))
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndTwoColumnsBoard(board);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.looses(), actual);
    }

    @Test
    void aTwoNumbersBoardWithItsFirstNumberUnmarkedAndItsSecondNumberMarkedLooses() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23"))
            .withNumber(BingoNumber.fromString("135").mark())
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndTwoColumnsBoard(board);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.looses(), actual);
    }

    @Test
    void aTwoNumbersBoardWithBothOfItsNumberMarkedWins() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23").mark())
            .withNumber(BingoNumber.fromString("135").mark())
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndTwoColumnsBoard(board);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.wins(), actual);
    }

    @Test
    void aThreeNumbersBoardWithAllOfItsNumberMarkedWins() {
        final var board = new BoardBuilder()
            .withNumber(BingoNumber.fromString("23").mark())
            .withNumber(BingoNumber.fromString("135").mark())
            .withNumber(BingoNumber.fromString("135").mark())
            .build();

        final var areAllNumbersMarked = areAllNumbersMarkedInAOneRowAndTwoColumnsBoard(board) && isNumberMarkedAt(board, 2);
        final var actual = getBoardMessage(areAllNumbersMarked);

        assertEquals(BoardMessage.wins(), actual);
    }

    private static boolean areAllNumbersMarkedInAOneRowAndOneColumnBoard(final Board board) {
        return isNumberMarkedAt(board, 0);
    }

    private static boolean areAllNumbersMarkedInAOneRowAndTwoColumnsBoard(final Board board) {
        return areAllNumbersMarkedInAOneRowAndOneColumnBoard(board) && isNumberMarkedAt(board, 1);
    }

    private static String getBoardMessage(final boolean areAllNumbersMarked) {
        return areAllNumbersMarked ? BoardMessage.wins() : BoardMessage.looses();
    }

    static boolean isNumberMarkedAt(final Board board, final int index) {
        return board.numbers[index].toString().contains("marked");
    }
}
