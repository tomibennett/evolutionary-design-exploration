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
    // board concept
    @Test
    void emptyBoardIsEmpty() {
        final var boardEmpty = "";
        final var board = boardEmpty;

        final var actual = board;

        assertEquals(boardEmpty, actual);
    }

    // introducing numbers
    @Test
    void boardWithNumber3IsBoardWithNumber3() {
        final var number1 = "3";
        final var board = number1;

        final var actual = board;

        assertEquals(board, actual);
    }

    @Test
    void boardWithNumber3And4IsBoardWithNumber3And4() {
        final var number1 = "3";
        final var sep = " ";
        final var number2 = "4";
        final var board = number1 + sep + number2;

        final var actual = board;

        assertEquals(board, actual);
    }

    @Test
    void boardWithNumber3And4And5IsBoardWithNumber3And4And5() {
        final var number1 = "3";
        final var sep = " ";
        final var number2 = "4";
        final var number3 = "5";
        final var board = number1 + sep + number2 + sep + number3;

        final var actual = board;

        assertEquals(board, actual);
    }

    // marking
    @Test
    void boardWithNumber3NotMarkedAnd2AsNumberToMarkIs3() {
        final var number1 = "3";
        final var numberToMark = "2";
        final var board = number1;

        final var actual = board;

        assertEquals(board, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd3AsNumberToMarkIs3Marked() {
        final var number1 = "3";
        final var sep = " ";
        final var numberToMark = number1;
        final var board = number1;

        String actual = board;

        if (Objects.equals(numberToMark, number1)) {
            actual = number1 + sep + "marked";
        }

        final var expected = number1 + sep + "marked";

        assertEquals(expected, actual);
    }

    @Test
    void boardWithNumber3NotMarkedAnd4NotMarkedAnd4AsNumberToMarkIs3UnmarkedAnd4Marked() {
        final var number1 = "3";
        final var sep = " ";
        final var number2 = "4";
        final var numberToMark = number2;
        final var board = number1 + sep + number2;

        String actual = board;

        if (Objects.equals(numberToMark, number1)) {
            actual = number1 + sep + "marked";
        }

        if (Objects.equals(numberToMark, number2)) {
            actual = number1 + sep + number2 + sep + "marked";
        }

        final var expected = number1 + sep + number2 + sep + "marked";

        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void boardWithNumber3NotMarkedAnd4And3AsNumberToMarkIs3MarkedAnd4Unmarked() {
        final var number1 = "3";
        final var sep = " ";
        final var number2 = "4";
        final var numberToMark = number1;
        final var board = number1 + sep + number2;

        String actual = board;

        if (Objects.equals(numberToMark, number1)) {
            actual = number1 + sep + "marked";
        }

        if (Objects.equals(numberToMark, number2)) {
            actual = number1 + sep + number2 + sep + "marked";
        }

        final var expected = number1 + sep + "marked" + sep + number2;

        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void boardWithNumber3NotMarkedAnd4NotMarkedAnd5NotMarkedAnd3AsNumberToMarkIs3MarkedAnd4UnmarkedAnd5NotMarked() {
        final var number1 = "3";
        final var sep = " ";
        final var number2 = "4";
        final var number3 = "5";
        final var numberToMark = number1;
        final var board = number1 + sep + number2 + sep + number3;

        String actual = null;

        if (Objects.equals(board, "")) {
            actual = "";
        } else if (Objects.equals(number1, numberToMark)) {
            actual = number1 + sep + "marked";
        } else {
            final var bingoNumbers = board.split(sep);

            if (bingoNumbers.length == 2) {
                if (Objects.equals(number1, numberToMark)) {
                    actual = number1 + sep + "marked" + sep + number2;
                } else if (Objects.equals(number2, numberToMark)) {
                    actual = number1 + sep + number2 + sep + "marked";
                }
            }
            if (actual == null) {
                if (bingoNumbers.length == 3) {
                    if (Objects.equals(number1, numberToMark)) {
                        actual = number1 + sep + "marked" + sep + number2 + sep + number3;
                    }
                }
                if (actual == null) {
                    actual = board;
                }
            }
        }

        final var expected = number1 + sep + "marked" + sep + number2 + sep + number3;

        assertEquals(expected, actual);
    }
}
