import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// what are the concepts here
// a board
// numbers
// marking and unmarking
// winning and so
public class Aoc4 {
    @Test
    void emptyBoardIsEmpty() {
        final var expected = "empty board";

        final var actual = "empty board" == "empty board" ? "empty board" : "";

        assertEquals(expected, actual);
    }

    @Test
    void boardWithNumber1IsBoardWithNumber1() {
        final var expected = "board with number 1";

        final var actual = "board with number 1" == "empty board" ? "empty board" : "board with number 1";

        assertEquals(expected, actual);
    }
}
