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
        final var number1 = "3";

        final var bingoBoard = new BoardBuilder()
            .withNumber(number1)
            .build();

        final var expected = new BoardBuilder().withNumber(number1).build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {
        final var number1 = "3";
        final var number2 = "66";

        final var bingoBoard = new BoardBuilder()
            .withNumber(number1)
            .withNumber(number2)
            .build();

        final var expected = new BoardBuilder()
            .withNumber(number1)
            .withNumber(number2)
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {
        final var number1 = "3";
        final var number2 = "66";
        final var number3 = "2987";

        final var bingoBoard = new BoardBuilder()
            .withNumber(number1)
            .withNumber(number2)
            .withNumber(number3)
            .build();

        final var expected = new BoardBuilder()
            .withNumber(number1)
            .withNumber(number2)
            .withNumber(number3)
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber("39")
                .build();
        final var numberDrawn = "39";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

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
                .withNumber("92")
                .withNumber("1234")
                .build();
        final var numberDrawn = "92";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber("1234")
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber("38")
                .withNumber("26")
                .build();
        final var numberDrawn = "26";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber("38")
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber("23")
                .withNumber("85")
                .withNumber("246")
                .build();
        final var numberDrawn = "23";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber("85")
                .withNumber("246")
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber("23")
                .withNumber("85")
                .withNumber("246")
                .build();
        final var numberDrawn = "85";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber("23")
                .withNumber(numberMarked)
                .withNumber("246")
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked()
    {
        final var board =
            new BoardBuilder()
                .withNumber("23")
                .withNumber("85")
                .withNumber("246")
                .build();
        final var numberDrawn = "246";

        final var numberMarked = markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber("23")
                .withNumber("85")
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }

    private static String markNumber(final String numberToMark) {
        return numberToMark + " " + "marked";
    }
}
