package lab5;

public class PointDriver 
{
    public static void main(String[] args) 
    {
        // Author : Aaron Tierney
        // Date : Octobor - 21st
        // Purpose : A test driver program for our Point/Circle inheritance

     
        Point myPoint = new Point(10, 20);
        Circle myCircle = new Circle(15, 30, 5);
        System.out.println("Point details : " + myPoint);
        System.out.println("Circle details: " + myCircle);
    }
}
