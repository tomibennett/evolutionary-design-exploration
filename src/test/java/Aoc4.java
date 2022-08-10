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
        String emptyBoard = "";

        String actual = emptyBoard == emptyBoard ? emptyBoard : "a board filled with something";

        assertEquals(actual, emptyBoard);
    }

    @Test
    void aBoardWithNumber1IsABoardWithNumber1() {
        String emptyBoard = "";
        String board = "1";

        String actual = board == emptyBoard ? emptyBoard : board;

        assertEquals(actual, board);
    }
}
