package Bingo;

class BingoNumber {
    private final String number;

    public BingoNumber(final String number) {
        this.number = number;
    }

    protected static BingoNumber fromString(final String number) {
        return new BingoNumber(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
