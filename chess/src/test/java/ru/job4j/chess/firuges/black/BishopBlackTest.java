package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        Cell input = Cell.F8;
        Figure bishop = new BishopBlack(input);
        Cell output = bishop.position();
        assertEquals(input, output);
    }

    @Test
    public void testCopy() {
        Cell input = Cell.F8;
        Cell dest = Cell.D6;
        Figure bishop = new BishopBlack(input);
        Figure bishop1 = bishop.copy(dest);
        Cell output = bishop1.position();
        assertEquals(dest, output);
    }

    @Test
    public void testWay() {
        Cell input = Cell.C1;
        Cell dest = Cell.G5;
        Figure bishop = new BishopBlack(input);
        Cell[] output = bishop.way(dest);
        assertArrayEquals(new Cell[]{Cell.D2,
                        Cell.E3, Cell.F4, Cell.G5},
                output);
    }
}