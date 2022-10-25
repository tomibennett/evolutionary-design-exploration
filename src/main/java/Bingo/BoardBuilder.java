package Bingo;

import java.util.ArrayList;
import java.util.List;

class BoardBuilder {
    private final List<String> numbers;

    public BoardBuilder() {
        this.numbers = new ArrayList<>();
    }

    BoardBuilder withNumber(BingoNumber number) {
        this.numbers.add(number.toString());

        return this;
    }

    public Board build() {
        return Board.fromList(numbers);
    }
}
