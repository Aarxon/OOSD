// Circle class that extends Point to add radius functionality
public class Circle extends Point
{
    protected int radius;

    // Constructor to create a circle with position and radius
    public Circle(int x, int y, int radius )
    {   
        super(x, y);
        this.radius = radius;

    }

    // Setter for radius
    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    // Getter for radius
    public int getRadius()
    {
        return radius;
    }

    // Override toString to include radius information
    public String toString()
    {
        return "X: " + x + " Y: " + y  + " Radius : " + radius;

    }
    
}
