package dev.fabiansurber.pieces;

import java.util.ArrayList;

public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite, isWhite ? "♙" : "♟");
    }

    @Override
    public ArrayList<Integer> getAvailableSquares(int currenSquareIndex) {
        return null;
    }
}
