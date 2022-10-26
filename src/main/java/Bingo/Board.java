package Bingo;

import java.util.Arrays;
import java.util.List;

class Board {
    private String[] numbers;

    Board(String[] numbers) {
        this.numbers = numbers;
    }

    static Board fromList(final List<BingoNumber> bingoNumbers) {
        final var numbers = bingoNumbers.stream().map(BingoNumber::toString).toList();

        return new Board(numbers.toArray(new String[0]));
    }

    void mark(BingoNumber numberDrawn) {
        this.numbers = Arrays
            .stream(numbers)
            .map(number -> BingoNumber.getNumber(number) == numberDrawn.toString()
                ? BingoNumber.fromString(number).mark()
                : BingoNumber.getNumber(number))
            .toList().toArray(new String[0]);
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
