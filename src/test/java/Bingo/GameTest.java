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
            .withNumber(buildNumber("3"))
            .build();

        final var expected = new BoardBuilder().withNumber(buildNumber("3")).build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66IsBoardWithNumber3And66() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(buildNumber("3"))
            .withNumber(buildNumber("66"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(buildNumber("3"))
            .withNumber(buildNumber("66"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void boardWithNumber3And66And2987IsBoardWithNumber3And66And2987() {

        final var bingoBoard = new BoardBuilder()
            .withNumber(buildNumber("3"))
            .withNumber(buildNumber("66"))
            .withNumber(buildNumber("2987"))
            .build();

        final var expected = new BoardBuilder()
            .withNumber(buildNumber("3"))
            .withNumber(buildNumber("66"))
            .withNumber(buildNumber("2987"))
            .build();

        assertEquals(expected, bingoBoard);
    }

    @Test
    void onAOneNumberBoardTheNumberDrawnIsPresentOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("39"))
                .build();
        final var numberDrawn = buildNumber("39");

        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("92"))
                .withNumber(buildNumber("1234"))
                .build();
        final var numberDrawn = buildNumber("92");
        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber(numberMarked))
                .withNumber(buildNumber("1234"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onATwoNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("38"))
                .withNumber(buildNumber("26"))
                .build();
        final var numberDrawn = buildNumber("26");

        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber("38"))
                .withNumber(buildNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtFirstPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("23"))
                .withNumber(buildNumber("85"))
                .withNumber(buildNumber("246"))
                .build();
        final var numberDrawn = buildNumber("23");

        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber(numberMarked))
                .withNumber(buildNumber("85"))
                .withNumber(buildNumber("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtSecondPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("23"))
                .withNumber(buildNumber("85"))
                .withNumber(buildNumber("246"))
                .build();
        final var numberDrawn = buildNumber("85");

        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber("23"))
                .withNumber(buildNumber(numberMarked))
                .withNumber(buildNumber("246"))
                .build();

        assertEquals(expected, actual);
    }

    @Test
    void onAThreeNumberBoardTheNumberDrawnIsPresentAtThirdPositionOnTheBoardThenItIsMarked() {
        final var board =
            new BoardBuilder()
                .withNumber(buildNumber("23"))
                .withNumber(buildNumber("85"))
                .withNumber(buildNumber("246"))
                .build();
        final var numberDrawn = buildNumber("246");

        final var numberMarked = Board.markNumber(getNumber(numberDrawn));
        board.mark(getNumber(numberDrawn));

        final var actual = board;

        final var expected =
            new BoardBuilder()
                .withNumber(buildNumber("23"))
                .withNumber(buildNumber("85"))
                .withNumber(buildNumber(numberMarked))
                .build();

        assertEquals(expected, actual);
    }

    private String getNumber(final BingoNumber numberDrawn) {
        return numberDrawn.toString();
    }

    private static BingoNumber buildNumber(final String number) {
        return BingoNumber.fromString(number);
    }


}
