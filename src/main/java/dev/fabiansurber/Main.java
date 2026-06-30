package dev.fabiansurber;

import dev.fabiansurber.cli.Printer;
import dev.fabiansurber.pieces.Piece;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
        Printer printer = new Printer();
        Piece[] board = new Piece[64];
        printer.printBoard(board);

    }
}
