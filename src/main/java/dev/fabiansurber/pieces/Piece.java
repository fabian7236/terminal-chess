package dev.fabiansurber.pieces;

import java.util.ArrayList;

public abstract class Piece {

    boolean isWhite;
    String symbol;

    public Piece(boolean isWhite, String symbol) {
        this.isWhite = isWhite;
        this.symbol = symbol;
    }

    public abstract ArrayList<Integer> getAvailableSquares(int currenSquareIndex);

    public boolean isWhite() {
        return isWhite;
    }

    public String getSymbol() {
        return symbol;
    }
}
