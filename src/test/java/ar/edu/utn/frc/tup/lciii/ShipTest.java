package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void testEqualsWithSamePosition() {
        Position position1 = new Position(1, 1);
        Ship ship1 = new Ship(position1, ShipStatus.AFLOAT);
        Ship ship2 = new Ship(position1, ShipStatus.AFLOAT);

        assertTrue(ship1.equals(ship2));
    }

    @Test
    void testEqualsWithDifferentPosition() {
        Position position1 = new Position(1, 1);
        Position position2 = new Position(2, 2);
        Ship ship1 = new Ship(position1, ShipStatus.AFLOAT);
        Ship ship2 = new Ship(position2, ShipStatus.AFLOAT);

        assertFalse(ship1.equals(ship2));
    }

    @Test
    void testEqualsWithItself() {
        Ship ship1 = new Ship(new Position(1, 1), ShipStatus.AFLOAT);

        assertTrue(ship1.equals(ship1));
    }
}