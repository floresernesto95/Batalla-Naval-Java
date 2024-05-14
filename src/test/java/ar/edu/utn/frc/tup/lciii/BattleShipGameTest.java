package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipGameTest {

    @Test
    void testAllShipsSunken() {
        List<Ship> ships = Arrays.asList(new Ship(ShipStatus.SUNKEN), new Ship(ShipStatus.SUNKEN));
        BattleShipGame game = new BattleShipGame();

        assertTrue(game.validateSunkenFleet(ships));
    }

    @Test
    void testShipsNotAllSunken() {
        List<Ship> ships = Arrays.asList(new Ship(ShipStatus.AFLOAT), new Ship(ShipStatus.SUNKEN));
        BattleShipGame game = new BattleShipGame();

        assertTrue(game.validateSunkenFleet(ships));
    }

    @Test
    void testAllShipsAfloat() {
        List<Ship> ships = Arrays.asList(new Ship(ShipStatus.AFLOAT), new Ship(ShipStatus.AFLOAT));
        BattleShipGame game = new BattleShipGame();

        assertTrue(game.validateSunkenFleet(ships)); // All ships are afloat, so it should return false
    }
}