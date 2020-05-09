package ie.gmit;

public class Motorcycle extends Vehicle {
    private String vehicleType;
    private String vehicleID;
    private int vehicleYear;

    private int vehicleSpeed;

    public Motorcycle(String vehicleType, String vehicleID, int vehicleYear) {
        if (vehicleType == null || vehicleID == null) {
            throw new IllegalArgumentException("A make and model are required to construct a motorcycle.");
        }
        this.vehicleType = vehicleType;
        this.vehicleID = vehicleID;
        this.vehicleYear = vehicleYear;

        this.vehicleSpeed = 0;
    }
    public void drive()
    {
        this.vehicleSpeed = 75;
    }
    public void park()
    {
        this.vehicleSpeed = 0;
    }
    public String getVehicleType()
    {
        return vehicleType;
    }
    public String getVehicleID()
    {
        return vehicleID;
    }
    public int getVehicleYear()
    {
        return vehicleYear;
    }

    public int getSpeed()
    {
        return vehicleSpeed;
    }
    public String toString() { return "This motorcycle is a " + vehicleYear + "" + vehicleType + "" + vehicleID + ";"; }
}