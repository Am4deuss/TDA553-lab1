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

    @Test
    void testScaniaFlatbed() {
        Scania storbil = new Scania();
        assertEquals(0, storbil.getFlatbedAngle());
    }

    @Test
    void testScaniaFlatbedRaiseLower() {
        Scania storarebil = new Scania();
        storarebil.setFlatbedAngle(71);
        assertNotEquals(71, storarebil.getFlatbedAngle());
        assertEquals(0, storarebil.getFlatbedAngle());
        storarebil.setFlatbedAngle(70);
        assertEquals(70, storarebil.getFlatbedAngle());
        storarebil.setFlatbedAngle(10);
        assertEquals(10, storarebil.getFlatbedAngle());
        storarebil.setFlatbedAngle(-10);
        assertNotEquals(-10, storarebil.getFlatbedAngle());
        storarebil.setFlatbedAngle(0);
        assertEquals(0, storarebil.getFlatbedAngle());
    }

    @Test
    void testGarageAdd() {
        Volvo240 kingenbil = new Volvo240();
        String[] accepted = {"Volvo240"};
        Garage sunkgarage = new Garage(4, accepted);
        sunkgarage.addVehicle(kingenbil);
        assertEquals(kingenbil, sunkgarage.getVehiclesStored().get(0));
    }

}
