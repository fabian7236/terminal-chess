package dev.fabiansurber.pieces;

import java.util.ArrayList;

public class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(isWhite, isWhite ? "♘" : "♞");
    }

    @Override
    public ArrayList<Integer> getAvailableSquares(int currenSquareIndex) {
        return null;
    }
}