package Bingo;

public class BoardMessage {
    public static final String BOARD = "board";
    public static final String SEPARATOR = " ";
    public static final String WINS = "wins";
    public static final String LOOSES = "looses";
    private final String status;

    public BoardMessage(final String status) {
        this.status = status;
    }

    static String looses() {
        return new BoardMessage(LOOSES).build();
    }

    static String wins() {
        return new BoardMessage(WINS).build();
    }

    private String build() {
        return BOARD + SEPARATOR + this.status;
    }
}
