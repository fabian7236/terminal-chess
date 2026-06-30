package dev.fabiansurber.pieces;

import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite, isWhite ? "♗" : "♝");
    }

    @Override
    public ArrayList<Integer> getAvailableSquares(int currenSquareIndex) {
        return null;
    }
}