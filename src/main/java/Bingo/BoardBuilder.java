package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return Board.fromList(getNumbers());
    }

    private List<String> getNumbers() {
        return bingoNumbers
            .stream()
            .map(BingoNumber::toString)
            .collect(Collectors.toList());
    }

}
