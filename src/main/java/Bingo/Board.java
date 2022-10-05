package Bingo;

import java.util.Arrays;
import java.util.List;

class Board {
    private String[] numbers;

    public Board(String[] numbers) {
        this.numbers = numbers;
    }

    public static Board fromList(List<String> numbers) {
        return new Board(numbers.toArray(new String[0]));
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
}
