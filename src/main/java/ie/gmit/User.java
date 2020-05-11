package ie.gmit;

public class User
{
    private String car;

    private String motorcycle;

    private String trailer;

    public User()
    {

    }

    public User(String car, String motorcycle, String trailer)
    {
        this.car = car;
        this.motorcycle = motorcycle;
        this.trailer = trailer;
    }

    /**
     * @return the car
     */
    public String getCar()
    {
        return car;
    }

    /**
     * @param car the name to set
     */
    public void setCar(String car)
    {
        this.car = car;
    }

    /**
     * @return the motorcycle
     */
    public String getMotorcycle()
    {
        return motorcycle;
    }

    /**
     * @param motorcycle the motorcycle to set
     */
    public void setMotorcycle(String motorcycle)
    {
        this.motorcycle = motorcycle;
    }

    /**
     * @return the trailer
     */
    public String getTrailer()
    {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(String trailer)
    {
        this.trailer = trailer;
    }

    @Override
    public String toString()
    {
        return "User [car=" + car + ", motorcycle=" + motorcycle + ", trailer=" + motorcycle + "]";
    }
}
