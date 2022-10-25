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
            .withNumber(BingoNumber.fromString("3"))
            .build();

        final var expected = new BoardBuilder().withNumber(BingoNumber.fromString("3")).build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .withNumber(BingoNumber.fromString("2987"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.fromString("3"))
            .withNumber(BingoNumber.fromString("66"))
            .withNumber(BingoNumber.fromString("2987"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("39"))
                .build();
        final var numberDrawn = BingoNumber.fromString("39");

        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("92"))
                .withNumber(BingoNumber.fromString("1234"))
                .build();
        final var numberDrawn = BingoNumber.fromString("92");
        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber(BingoNumber.fromString("1234"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("38"))
                .withNumber(BingoNumber.fromString("26"))
                .build();
        final var numberDrawn = BingoNumber.fromString("26");

        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("38"))
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23"))
                .withNumber(BingoNumber.fromString("85"))
                .withNumber(BingoNumber.fromString("246"))
                .build();
        final var numberDrawn = BingoNumber.fromString("23");

        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber(BingoNumber.fromString("85"))
                .withNumber(BingoNumber.fromString("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23"))
                .withNumber(BingoNumber.fromString("85"))
                .withNumber(BingoNumber.fromString("246"))
                .build();
        final var numberDrawn = BingoNumber.fromString("85");

        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23"))
                .withNumber(numberMarked)
                .withNumber(BingoNumber.fromString("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23"))
                .withNumber(BingoNumber.fromString("85"))
                .withNumber(BingoNumber.fromString("246"))
                .build();
        final var numberDrawn = BingoNumber.fromString("246");

        final var numberMarked = numberDrawn.markNumber();
        board.mark(numberDrawn.toString());

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.fromString("23"))
                .withNumber(BingoNumber.fromString("85"))
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }


}
