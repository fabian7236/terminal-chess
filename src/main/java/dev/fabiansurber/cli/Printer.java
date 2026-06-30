package dev.fabiansurber.cli;

import dev.fabiansurber.pieces.Piece;

import java.util.StringJoiner;

public class Printer {

    private final int BOARD_DIMENSION = 8;

    public void drawBoard(Piece[] board) {
        StringJoiner line = new StringJoiner(" ");
        line.add(BOARD_DIMENSION + "");
        for (int i = 0; i < Math.pow(BOARD_DIMENSION, 2); i++) {
            if (board[i] == null) {
                line.add("[ ]");
            } else {
                line.add("[" + board[i].getSymbol() + "]");
            }
            if (i > 0 && (i+1) % BOARD_DIMENSION == 0) {
                System.out.println(line);
                line = new StringJoiner(" ");
                int rowNumber = BOARD_DIMENSION - Math.ceilDiv(i, 8);
                line.add(rowNumber + "");
            }
        }
        line = new StringJoiner(" ");
        String[] colLetters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        line.add(" ");
        for (String letter : colLetters) {
           line.add(" " + letter + " ");
        }
        System.out.println(line);

    }

}
