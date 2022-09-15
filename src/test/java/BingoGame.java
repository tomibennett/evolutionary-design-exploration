import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

// what are the concepts here
// a board
// numbers
// marking and unmarking
// winning and so
public class BingoGame {
    private String getNewBoard(String board, String numberToMark) {
        if (Objects.equals(board, "")) {
            return "";
        }

        if (Objects.equals(board, numberToMark)) {
            return board + " " + "marked";
        }

        final var bingoNumbers = board.split(" ");

        if (bingoNumbers.length == 2) {
            if (Objects.equals(bingoNumbers[0], numberToMark)) {
                return bingoNumbers[0] + " " + "marked" + " " + bingoNumbers[1];
            }

            if (Objects.equals(bingoNumbers[1], numberToMark)) {
                return bingoNumbers[0] + " " + bingoNumbers[1] + " " + "marked";
            }
        }

        if (bingoNumbers.length == 3) {
            if (Objects.equals(bingoNumbers[0], numberToMark)) {
                return bingoNumbers[0] + " " + "marked" + " " + bingoNumbers[1] + " " + bingoNumbers[2];
            }
        }

        return board;
    }

    // board concept
    @Test
    void emptyBoardIsEmpty() {
        final var boardEmpty = "";

        final var actual = getNewBoard(boardEmpty, "");

        assertEquals(boardEmpty, actual);
    }

    // introducing numbers
    @Test
    void boardWithNumber3IsBoardWithNumber3() {
        final var boardWithNumberThree = "3";

        final var actual = getNewBoard(boardWithNumberThree, "");

        assertEquals(boardWithNumberThree, actual);
    }

    @Test
    void boardWithNumber3And4IsBoardWithNumber3And4() {
        final var board = "3" + " " + "4";

        final var actual = getNewBoard(board, "");

        assertEquals(board, actual);
    }

    @Test
    void boardWithNumber3And4And5IsBoardWithNumber3And4And5() {
        final var board = "3" + " " + "4" + " " + "5";

        final var actual = getNewBoard(board, "");

        assertEquals(board, actual);
    }

    // marking
    @Test
    void boardWithNumber3NotMarkedAnd2AsNumberToMarkIs3() {
        final var board = "3";
        final var numberToMark = "2";

        final var actual = getNewBoard(board, numberToMark);

        assertEquals(board, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd3AsNumberToMarkIs3Marked() {
        final var board = "3";
        final var numberToMark = "3";

        final var actual = getNewBoard(board, numberToMark);

        final var expected = "3 marked";

        assertEquals(expected, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd4NotMarkedAnd4AsNumberToMarkIs3UnmarkedAnd4Marked() {
        final var board = "3 4";
        final var numberToMark = "4";

        final var actual = getNewBoard(board, numberToMark);

        final var expected = "3 4 marked";

        assertEquals(expected, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd4And3AsNumberToMarkIs3MarkedAnd4Unmarked() {
        final var board = "3 4";
        final var numberToMark = "3";

        final var actual = getNewBoard(board, numberToMark);

        final var expected = "3 marked 4";

        assertEquals(expected, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd4NotMarkedAnd5NotMarkedAnd3AsNumberToMarkIs3MarkedAnd4UnmarkedAnd5NotMarked() {
        final var board = "3 4 5";
        final var numberToMark = "3";

        final var actual = getNewBoard(board, numberToMark);

        final var expected = "3 marked 4 5";

        assertEquals(expected, actual);
    }
}
