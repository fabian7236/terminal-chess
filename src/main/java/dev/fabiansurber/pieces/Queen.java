package dev.fabiansurber.pieces;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite, isWhite ? "♕" : "♛");
    }

    @Override
    public ArrayList<Integer> getAvailableSquares(int currenSquareIndex) {
        return null;
    }
}