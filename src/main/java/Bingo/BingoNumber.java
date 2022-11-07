package Bingo;

import java.util.Objects;

class BingoNumber {
    private final String number;

    public BingoNumber(final String number) {
        this.number = number;
    }

    static BingoNumber fromString(final String number) {
        return new BingoNumber(number);
    }

    BingoNumber mark() {
        return fromString(number + " " + "marked");
    }

    @Override
    public String toString() {
        return number;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final BingoNumber that = (BingoNumber) o;
        return number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
