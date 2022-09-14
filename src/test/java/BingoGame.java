import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// what are the concepts here
// a board
// numbers
// marking and unmarking
// winning and so
public class BingoGame {
    private String getNewBoard(String board) {
        return board;
    }

    // board concept
    @Test
    void emptyBoardIsEmpty() {
        final var boardEmpty = "";

        final var actual = getNewBoard(boardEmpty);

        assertEquals(boardEmpty, actual);
    }

    // introducing numbers
    @Test
    void boardWithNumber3IsBoardWithNumber3() {
        final var boardWithNumberThree = "3";

        final var actual = getNewBoard(boardWithNumberThree);

        assertEquals(boardWithNumberThree, actual);
    }

    @Test
    void boardWithNumber3And4IsBoardWithNumber3And4() {
        final var boardWithNumber3And4 = "3 4";

        final var actual = getNewBoard(boardWithNumber3And4);

        assertEquals(boardWithNumber3And4, actual);
    }

    @Test
    void boardWithNumber3And4And5IsBoardWithNumber3And4And5() {
        final var boardWithNumber3And4And5 = "3 4 5";

        final var actual = getNewBoard(boardWithNumber3And4And5);

        assertEquals(boardWithNumber3And4And5, actual);
    }
}
