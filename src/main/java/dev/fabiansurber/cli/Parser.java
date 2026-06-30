package dev.fabiansurber.cli;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    final Scanner scanner = new Scanner(System.in);
    // First section = Normal Piece moves, Second section: Castling, Third Section: Pawn moves, Forth section: Pawn Promotion
    final String algebraicNotation = "(([RNBKQ][a-h]?[1-8]?x?([a-h][1-8]))|((0-0)(-0)?)|([a-h]?x?[a-h][2-7])|[a-h]?x?[a-h][18]=[RNBQ])[+#]?";

    public String readTurn() {
        String turn = scanner.next();
        return "";
    }

    public boolean isAlgebraicNotation(String move) {
        return move.matches(algebraicNotation);
    }


    public String parseAlgebraicNotation() {
        return "";
    }

}
