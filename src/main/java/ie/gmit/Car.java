package ie.gmit;

public class Car extends Vehicle {
    private String vehicleType;
    private String vehicleID;
    private int vehicleYear;
    private int vehicleSpeed;
    public Car(String make, String model, int year) {
        if (make == null || model == null) {
            throw new IllegalArgumentException("A make and model are    required to construct a car.");
        }
        this.vehicleType = vehicleType;
        this.vehicleID = vehicleID;
        this.vehicleYear = vehicleYear;

        this.vehicleSpeed = 0;
    }
    public void drive() { this.vehicleSpeed = 60; }
    public void park() { this.vehicleSpeed = 0; }
    public String getVehicleType() { return vehicleType; }
    public String getVehicleID() { return vehicleID; }
    public int getVehicleYear() { return vehicleYear; }

    public int getSpeed() { return vehicleSpeed; }
    public String toString() { return "This car is a " + vehicleYear + "" + vehicleType + ""  + vehicleID + ";"; }
}