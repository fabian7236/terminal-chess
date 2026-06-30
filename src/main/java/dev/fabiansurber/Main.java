package dev.fabiansurber;

import dev.fabiansurber.cli.Printer;
import dev.fabiansurber.pieces.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
        Printer printer = new Printer();
        Piece[] board = new Piece[64];
        initializeSide(board, 0, 1, false);
        initializeSide(board, 7, 6, true);
        printer.printBoard(board);
    }

    public static void initializeSide(Piece[] board, int baseRowIndex, int pawnRowIndex, boolean isWhite) {
        int offset = baseRowIndex * 8;
        ArrayList<Piece> pieceRow = new ArrayList<>();
        pieceRow.add(new Rook(isWhite));
        pieceRow.add(new Knight(isWhite));
        pieceRow.add(new Bishop(isWhite));
        pieceRow.add(new Queen(isWhite));
        pieceRow.add(new King(isWhite));
        pieceRow.add(new Bishop(isWhite));
        pieceRow.add(new Knight(isWhite));
        pieceRow.add(new Rook(isWhite));
        for (int i = 0; i < 8; i++) {
            board[offset+i] = pieceRow.get(i);
        }
        for (int i = 0; i < 8; i++) {
            board[pawnRowIndex*8 + i] = new Pawn(isWhite);
        }
    }
}
