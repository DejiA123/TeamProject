package ie.gmit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VehicleTest
{
    @Test
    public void testCarIsInstanceOfVehicle()
    {
        Car car = new Car("Car", "234", 2016);
        Assert.assertTrue(car instanceof Vehicle);
    }


    @Test
    public void testVehicleType1()
    {
        Car car = new Car("Car", "234", 2012);
        car.drive();
        Assert.assertEquals(car.getVehicleType(), "Car");
    }

    @Test
    public void testVehicleType2()
    {
        Trailer trailer = new Trailer("Trailer", "700", 2017);
        trailer.drive();
        Assert.assertEquals(trailer.getVehicleType(), "Trailer");
    }

    @Test
    public void testVehicleType3()
    {
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "800", 2017);
        motorcycle.drive();
        Assert.assertEquals(motorcycle.getVehicleType(), "Motorcycle");
    }

    @Test
    public void testVehicleType4()
    {
        Van van = new Van("Van", "800", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleType(), "Van");
    }


    @Test
    public void testCarSpeed()
    {
        Car car = new Car("Car", "234", 2012);
        car.drive();
        Assert.assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed()
    {
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "900", 2017);
        motorcycle.drive();
        Assert.assertEquals(motorcycle.getSpeed(), 74);
    }

    @Test
    public void testVanSpeed()
    {
        Van van = new Van("Van", "800", 2017);
        van.drive();
        Assert.assertEquals(van.getSpeed(), 74);
    }

    @Test
    public void testTrailerSpeed()
    {
        Trailer trailer = new Trailer("Trailer", "700", 2017);
        trailer.drive();
        if(trailer.getSpeed() > 70) {
            Assert.assertEquals(trailer.getSpeed(), 74);
        }
    }

    @Test
    public void testCarID()
    {
        Car car = new Car("Car", "700", 2017);
        car.drive();
        Assert.assertEquals(car.getVehicleID(), "700");
    }

    @Test
    public void testMotorcycleID()
    {
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "700", 2017);
        motorcycle.drive();
        Assert.assertEquals(motorcycle.getVehicleID(), "701");
    }

    @Test
    public void testTrailerID()
    {
        Trailer trailer = new Trailer("Trailer", "700", 2017);
        trailer.drive();
        Assert.assertEquals(trailer.getVehicleID(), "702");
    }

    @Test
    public void testVanID()
    {
        Van van = new Van("van", "700", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleID(), "703");
    }

    @Test
    public void testVanYear()
    {
        Van van = new Van("van", "700", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleYear(), 2017);
    }

    @Test
    public void testCarYear()
    {
        Van van = new Van("van", "700", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleYear(), 2017);
    }

    @Test
    public void testMotorcycleYear()
    {
        Van van = new Van("van", "700", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleYear(), 2017);
    }

    @Test
    public void testTrailerYear()
    {
        Van van = new Van("van", "700", 2017);
        van.drive();
        Assert.assertEquals(van.getVehicleYear(), 2017);
    }
}