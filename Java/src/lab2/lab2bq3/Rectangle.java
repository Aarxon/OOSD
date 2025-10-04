package lab2.lab2bq3;

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

    public double getArea()
    {
        return length * width;
    }

    public double getPerimiter()
    {
        return 2 * (length + width);
    }

    //Other Methods
    public String toString()
    {
        return "Length = [" + length + "]" + " Width = [" + width + "]";
    }

    public void printRectangle()
    {
        String w = "*";

    // print top
    for(int i = 0; i < width - 1; i++)
    {
        w += "*";
    }

    System.out.println(w); 
    // print top

    for(int j = 0; j < length - 2; j++)
    {
        System.out.print("*");
        for(int x = 0; x < width - 2; x++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    // print bottom
    System.out.println(w); 
    // print bottom
    }
}
