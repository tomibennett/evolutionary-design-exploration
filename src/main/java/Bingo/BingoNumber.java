package Bingo;

public class BingoNumber {
    private final String number;

    BingoNumber(final String number) {
        this.number = number;
    }

    static String getNumber(String number) {
        return BingoNumber.fromString(number).toString();
    }

    static BingoNumber fromString(final String number) {
        return new BingoNumber(number);
    }

    String mark() {
        return fromString(number + " " + "marked").toString();
    }

    @Override
    public String toString() {
        return number;
    }
}
