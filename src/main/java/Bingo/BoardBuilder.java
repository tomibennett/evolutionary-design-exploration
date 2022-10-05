package Bingo;

import java.util.ArrayList;
import java.util.List;

class BoardBuilder {
    private List<String> numbers;

    public BoardBuilder() {
        this.numbers = new ArrayList<>();
    }

    BoardBuilder withNumber(String number) {
        this.numbers.add(number);

        return this;
    }

    public Board build() {
        return Board.fromList(numbers);
    }


}
