package ie.gmit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2016);
        Assert.assertTrue(car instanceof Vehicle);
    }


    @Test
    public void testCarSpeed() {
        Car car = new Car("Honda", "Civic", 2012);
        car.drive();
        Assert.assertEquals(car.getSpeed(), 60);
    }
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bolt", 2017);
        motorcycle.drive();

        Assert.assertEquals(motorcycle.getSpeed(), 74);
    }


}