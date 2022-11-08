package Bingo;

import java.util.Arrays;
import java.util.List;

class Board {
    BingoNumber[] numbers;

    Board(BingoNumber[] numbers) {
        this.numbers = numbers;
    }

    static Board fromList(final List<BingoNumber> numbers) {
        return new Board(numbers.toArray(new BingoNumber[0]));
    }

    void mark(final BingoNumber numberDrawn) {
        numbers = Arrays
            .stream(numbers)
            .map(number -> number.equals(numberDrawn)
                ? number.mark()
                : number)
            .toList()
            .toArray(new BingoNumber[0]);
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
