package dev.fabiansurber.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    Parser parser = new Parser();

    @Test
    void testPawnMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("e4")),
                () -> assertTrue(parser.isAlgebraicNotation("bc3")),
                () -> assertTrue(parser.isAlgebraicNotation("bxc3")),
                () -> assertTrue(parser.isAlgebraicNotation("f6+")),
                () -> assertTrue(parser.isAlgebraicNotation("fxh7#")),
                () -> assertFalse(parser.isAlgebraicNotation("e")),
                () -> assertFalse(parser.isAlgebraicNotation("e8")),
                () -> assertFalse(parser.isAlgebraicNotation("a0")),
                () -> assertFalse(parser.isAlgebraicNotation("2"))
        );
    }

    @Test
    void testKnightMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Nf3")),
                () -> assertTrue(parser.isAlgebraicNotation("Nbd2")),
                () -> assertTrue(parser.isAlgebraicNotation("N1d2")),
                () -> assertTrue(parser.isAlgebraicNotation("Nxf3")),
                () -> assertTrue(parser.isAlgebraicNotation("Nbxd2")),
                () -> assertFalse(parser.isAlgebraicNotation("Nf9")),
                () -> assertFalse(parser.isAlgebraicNotation("Nz3")),
                () -> assertFalse(parser.isAlgebraicNotation("N"))
        );
    }

    @Test
    void testBishopMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Bb5")),
                () -> assertTrue(parser.isAlgebraicNotation("Bxc6")),
                () -> assertTrue(parser.isAlgebraicNotation("Bg5+")),
                () -> assertFalse(parser.isAlgebraicNotation("Bb9")),
                () -> assertFalse(parser.isAlgebraicNotation("B"))
        );
    }

    @Test
    void testRookMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Rad1")),
                () -> assertTrue(parser.isAlgebraicNotation("R1a3")),
                () -> assertTrue(parser.isAlgebraicNotation("Rxd4")),
                () -> assertFalse(parser.isAlgebraicNotation("Rd")),
                () -> assertFalse(parser.isAlgebraicNotation("Ri4"))
        );
    }

    @Test
    void testQueenMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Qd4")),
                () -> assertTrue(parser.isAlgebraicNotation("Qxd4")),
                () -> assertTrue(parser.isAlgebraicNotation("Qh4e1")),
                () -> assertFalse(parser.isAlgebraicNotation("Qz9")),
                () -> assertFalse(parser.isAlgebraicNotation("Q"))
        );
    }

    @Test
    void testKingMoveRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Kg1")),
                () -> assertTrue(parser.isAlgebraicNotation("Kxg1")),
                () -> assertFalse(parser.isAlgebraicNotation("Kg9")),
                () -> assertFalse(parser.isAlgebraicNotation("K"))
        );
    }

    @Test
    void testCastlingRegex() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("0-0")),
                () -> assertTrue(parser.isAlgebraicNotation("0-0-0")),
                () -> assertTrue(parser.isAlgebraicNotation("0-0+")),
                () -> assertTrue(parser.isAlgebraicNotation("0-0-0#")),
                () -> assertFalse(parser.isAlgebraicNotation("0-0-0-0")),
                () -> assertFalse(parser.isAlgebraicNotation("O-O"))
        );
    }

    @Test
    void testCheckAndCheckmateSuffixes() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("Qd4+")),
                () -> assertTrue(parser.isAlgebraicNotation("Qd4#")),
                () -> assertFalse(parser.isAlgebraicNotation("Qd4++")),
                () -> assertFalse(parser.isAlgebraicNotation("Qd4#+"))
        );
    }

    @Test
    void testPromotionMoves() {
        assertAll(
                () -> assertTrue(parser.isAlgebraicNotation("e8=Q")),
                () -> assertTrue(parser.isAlgebraicNotation("exd8=N")),
                () -> assertTrue(parser.isAlgebraicNotation("a1=R+")),
                () -> assertTrue(parser.isAlgebraicNotation("exd1=Q")),
                () -> assertTrue(parser.isAlgebraicNotation("bxc8=Q")),
                () -> assertTrue(parser.isAlgebraicNotation("h1=N#")),
                () -> assertTrue(parser.isAlgebraicNotation("a8=B")),
                () -> assertFalse(parser.isAlgebraicNotation("e8=K")),
                () -> assertFalse(parser.isAlgebraicNotation("e4=Q")),
                () -> assertFalse(parser.isAlgebraicNotation("e8=")),
                () -> assertFalse(parser.isAlgebraicNotation("e8Q")),
                () -> assertFalse(parser.isAlgebraicNotation("e8=Q+#")),
                () -> assertFalse(parser.isAlgebraicNotation("e8=Q=Q")),
                () -> assertFalse(parser.isAlgebraicNotation("e8=q")),
                () -> assertFalse(parser.isAlgebraicNotation("i8=Q")),
                () -> assertFalse(parser.isAlgebraicNotation("e=Q"))
        );
    }

    @Test
    void testInvalidMoves() {
        assertAll(
                () -> assertFalse(parser.isAlgebraicNotation("")),
                () -> assertFalse(parser.isAlgebraicNotation("e4e5")),
                () -> assertFalse(parser.isAlgebraicNotation("Xf3")),
                () -> assertFalse(parser.isAlgebraicNotation("e4 ")),
                () -> assertFalse(parser.isAlgebraicNotation(" e4"))
        );
    }

}
