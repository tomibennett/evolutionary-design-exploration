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
            .withNumber(BingoNumber.getNumber("3"))
            .build();

        final var expected = new BoardBuilder().withNumber(BingoNumber.getNumber("3")).build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.getNumber("3"))
            .withNumber(BingoNumber.getNumber("66"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.getNumber("3"))
            .withNumber(BingoNumber.getNumber("66"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(BingoNumber.getNumber("3"))
            .withNumber(BingoNumber.getNumber("66"))
            .withNumber(BingoNumber.getNumber("2987"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(BingoNumber.getNumber("3"))
            .withNumber(BingoNumber.getNumber("66"))
            .withNumber(BingoNumber.getNumber("2987"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("39"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("39");

        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("92"))
                .withNumber(BingoNumber.getNumber("1234"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("92");
        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber(numberMarked))
                .withNumber(BingoNumber.getNumber("1234"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("38"))
                .withNumber(BingoNumber.getNumber("26"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("26");

        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("38"))
                .withNumber(BingoNumber.getNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("23"))
                .withNumber(BingoNumber.getNumber("85"))
                .withNumber(BingoNumber.getNumber("246"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("23");

        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber(numberMarked))
                .withNumber(BingoNumber.getNumber("85"))
                .withNumber(BingoNumber.getNumber("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("23"))
                .withNumber(BingoNumber.getNumber("85"))
                .withNumber(BingoNumber.getNumber("246"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("85");

        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("23"))
                .withNumber(BingoNumber.getNumber(numberMarked))
                .withNumber(BingoNumber.getNumber("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("23"))
                .withNumber(BingoNumber.getNumber("85"))
                .withNumber(BingoNumber.getNumber("246"))
                .build();
        final var numberDrawn = BingoNumber.getNumber("246");

        final var numberMarked = Board.markNumber(BingoNumber.getNumber(numberDrawn));
        board.mark(BingoNumber.getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(BingoNumber.getNumber("23"))
                .withNumber(BingoNumber.getNumber("85"))
                .withNumber(BingoNumber.getNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

}
