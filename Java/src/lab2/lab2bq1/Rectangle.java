package lab2.lab2bq1;

//Made by Aaron Tierney
//C00312018

public class Rectangle 
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 1;
        width = 1;
    }

    //Setters
    public void setLength(int length)
    {
        this.length = length;

        //logic
        if(length < 0.0)
        {
            System.out.println("Must be bigger then 0");
        }
        else if (length >= 40.0)
        {
            System.out.println("Must be less then or equal to 40");
        }
    }

    public void setWidth(int width)
    {
        this.width = width;

        //logic
        if(width < 0.0)
        {
            System.out.println("Must be bigger then 0");
        }
        else if (width >= 40.0)
        {
            System.out.println("Must be less then or equal to 40");
        }
    }
    
    //Getters
    public double getLength()
    {
        return length;
    }

     public double getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = [" + length + "]" + " Width = [" + width + "]";
    }
}
