package lab4;

public class Office
{
    // Static variable for auto-incrementing IDs
    private static int nextID = 100;
    private  int office;

    // Constructor - assigns unique office number
    public Office()
    {   
        this.office = nextID;
        nextID ++;
    }

    // Setter
    public void setOffice(int office)
    {
        this.office = office;
    }
    
    // Getter
    public  int getOffice()
    {
        return office;
    }

    // String representation
    @Override
    public String toString()
    {
        return "Office Number: " + office;
    }

   
}
