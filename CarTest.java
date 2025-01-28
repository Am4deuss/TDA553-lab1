import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testMoveForward() {
        Saab95 pissbil = new Saab95();
        pissbil.startEngine();
        pissbil.move();
        pissbil.move();
        assertEquals(0.2, pissbil.getY());
    }

    @Test
    void testTurnRight() {
        Volvo240 kingenbil = new Volvo240();
        kingenbil.startEngine();
        kingenbil.move();
        kingenbil.turnRight();
        kingenbil.move();
        assertEquals(0.1, kingenbil.getX());
        assertEquals(0.1, kingenbil.getY());
    }

    @Test
    void testTurnLeft() {
        Volvo240 kingenbil = new Volvo240();
        kingenbil.startEngine();
        kingenbil.move();
        kingenbil.turnLeft();
        kingenbil.move();
        assertEquals(-0.1, kingenbil.getX());
        assertEquals(0.1, kingenbil.getY());
    }

    @Test
    void testGas() {
        Volvo240 kingenbil = new Volvo240();
        kingenbil.startEngine();
        double testAmount = 1.1;
        assertFalse(kingenbil.gas(testAmount));
        testAmount = 1.0;
        assertTrue(kingenbil.gas(testAmount));
        testAmount = -0.5;
        assertFalse(kingenbil.gas(testAmount));
    }
}