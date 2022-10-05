package Bingo;

import java.util.List;

class Board {
    private static String[] numbers;

    public Board(String[] numbers) {
        this.numbers = numbers;
    }

    public static Board fromList(List<String> numbers) {
        return new Board(numbers.toArray(new String[0]));
    }

    public String printBoard() {
        StringBuilder boardBuilder = new StringBuilder();

        for (String number : numbers) {
            if (number != null) {
                boardBuilder
                    .append(boardBuilder.toString().isEmpty() ? "" : " ")
                    .append(number);
            }
        }

        return boardBuilder.toString();
    }

}
