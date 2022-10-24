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
        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3").toString())
            .build();

        final var expected = new BoardBuilder().withNumber(BingoNumber.fromString("3").toString()).build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3").toString())
            .withNumber(BingoNumber.fromString("66").toString())
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3").toString())
            .withNumber(BingoNumber.fromString("66").toString())
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3").toString())
            .withNumber(BingoNumber.fromString("66").toString())
            .withNumber(BingoNumber.fromString("2987").toString())
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3").toString())
            .withNumber(BingoNumber.fromString("66").toString())
            .withNumber(BingoNumber.fromString("2987").toString())
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("39").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("39").toString();

        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("92").toString())
                .withNumber(BingoNumber.fromString("1234").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("92").toString();
        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .withNumber(BingoNumber.fromString("1234").toString())
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("38").toString())
                .withNumber(BingoNumber.fromString("26").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("26").toString();

        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("38").toString())
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23").toString())
                .withNumber(BingoNumber.fromString("85").toString())
                .withNumber(BingoNumber.fromString("246").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("23").toString();

        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .withNumber(BingoNumber.fromString("85").toString())
                .withNumber(BingoNumber.fromString("246").toString())
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23").toString())
                .withNumber(BingoNumber.fromString("85").toString())
                .withNumber(BingoNumber.fromString("246").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("85").toString();

        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23").toString())
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .withNumber(BingoNumber.fromString("246").toString())
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23").toString())
                .withNumber(BingoNumber.fromString("85").toString())
                .withNumber(BingoNumber.fromString("246").toString())
                .build();
        final var numberDrawn = BingoNumber.fromString("246").toString();

        final var numberMarked = Board.markNumber(BingoNumber.fromString(numberDrawn).toString());
        board.mark(BingoNumber.fromString(numberDrawn).toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23").toString())
                .withNumber(BingoNumber.fromString("85").toString())
                .withNumber(BingoNumber.fromString(numberMarked).toString())
                .build();

        assertEquals(expected, actual);
    }

}
