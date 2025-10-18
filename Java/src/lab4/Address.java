package lab4;

public class Address 
{
    // Instance variables
    private final String city;
    private final String street;
    private final String county;

    // Constructor
    public Address(String city, String street, String county)
    {
        this.city = city;
        this.street = street;
        this.county = county;
    }

    // String representation
    @Override
    public String toString()
    {
        return "Address: " + "Street: " + street + ", City: " + city + ", County: " + county;
    }
}

