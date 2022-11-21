package Bingo;

import java.util.ArrayList;
import java.util.List;

class BoardBuilder {
    private final List<BingoNumber> bingoNumbers;

    public BoardBuilder() {
        bingoNumbers = new ArrayList<>();
    }

    BoardBuilder withNumber(BingoNumber number) {
        bingoNumbers.add(number);

        return this;
    }

    public Board build() {
        return Board.fromList(bingoNumbers);
    }
}
