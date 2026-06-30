package dev.fabiansurber.pieces;

import java.util.ArrayList;

public class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite, isWhite ? "♖" : "♜");
    }

    @Override
    public ArrayList<Integer> getAvailableSquares(int currenSquareIndex) {
        return null;
    }
}