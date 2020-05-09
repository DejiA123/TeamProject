package ie.gmit;

public abstract class Vehicle {
    private String vehicleType;
    private String vehicleID;
    private int vehicleYear;

    private int vehicleSpeed;
    public abstract void drive();
    public abstract void park();
}