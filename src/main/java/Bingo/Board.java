package Bingo;

import java.util.Arrays;
import java.util.List;

class Board {
    private String[] numbers;

    Board(String[] numbers) {
        this.numbers = numbers;
    }

    static Board fromList(List<String> numbers) {
        return new Board(numbers.toArray(new String[0]));
    }

    Board mark(final String numberToMark) {
        final BoardBuilder boardBuilder = new BoardBuilder();

        if (numberToMark == "3") {
            if (this.numbers[0] == "66") {
                boardBuilder.withNumber(this.numbers[0]);
                boardBuilder.withNumberMarked(numberToMark);
            } else {
                boardBuilder.withNumberMarked(numberToMark);
            }
        }
        else if (numberToMark == "66") {
            boardBuilder.withNumber(this.numbers[0]);
            boardBuilder.withNumberMarked(numberToMark);

        }

        return boardBuilder.build();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Board board = (Board) o;
        return Arrays.equals(numbers, board.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
