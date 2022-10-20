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
        final var number1 = "39";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .build();
        final var numberDrawn = number1;

        final var numberMarked = Board.markNumber(numberDrawn);
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
        final var number1 = "92";
        final var number2 = "1234";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .build();
        final var numberDrawn = number1;
        final var numberMarked = Board.markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber(number2)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var number1 = "38";
        final var number2 = "26";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .build();
        final var numberDrawn = number2;

        final var numberMarked = Board.markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var number1 = "23";
        final var number2 = "85";
        final var number3 = "246";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .withNumber(number3)
                .build();
        final var numberDrawn = number1;

        final var numberMarked = Board.markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(numberMarked)
                .withNumber(number2)
                .withNumber(number3)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var number1 = "23";
        final var number2 = "85";
        final var number3 = "246";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .withNumber(number3)
                .build();
        final var numberDrawn = number2;

        final var numberMarked = Board.markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(numberMarked)
                .withNumber(number3)
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var number1 = "23";
        final var number2 = "85";
        final var number3 = "246";
        final var board =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .withNumber(number3)
                .build();
        final var numberDrawn = number3;

        final var numberMarked = Board.markNumber(numberDrawn);
        board.mark(numberDrawn);

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(number1)
                .withNumber(number2)
                .withNumber(numberMarked)
                .build();

        assertEquals(expected, actual);
    }
}
