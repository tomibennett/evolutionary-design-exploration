package Bingo;

import java.util.ArrayList;
import java.util.List;

class BoardBuilder {
    private List<BingoNumber> bingoNumbers;

    public BoardBuilder() {
        this.bingoNumbers = new ArrayList<>();
    }

    BoardBuilder withNumber(BingoNumber number) {
        this.bingoNumbers.add(number);

        return this;
    }

    public Board build() {
        return Board.fromBingoNumbersList(bingoNumbers);
    }
}
