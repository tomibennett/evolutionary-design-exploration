import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertEquals;


// what are the concepts here
// a board
// numbers
// marking and unmarking
// winning and so
public class BingoGame {

    @Test
    void emptyBoardIsEmpty() {
        final var boardEmpty = "";

        final var actual = "";

        assertEquals(boardEmpty, actual);
    }

    // introducing numbers
    @Test
    void boardWithNumber3IsBoardWithNumber3() {
        final var boardWithNumberThree = "3";

        final var actual = "3" == "3" ? "3" : "";

        assertEquals(boardWithNumberThree, actual);
    }
}
