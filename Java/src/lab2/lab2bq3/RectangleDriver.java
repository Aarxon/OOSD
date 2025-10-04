package lab2.lab2bq3;

//Made by Aaron Tierney
//C00312018

public class RectangleDriver
{
    public static void main(String[] args) 
    {
        //Creating objects
        Rectangle rectang = new Rectangle();


        //Testing my toString method    
        System.out.println(rectang.toString());

        //Testing setters
        rectang.setLength(10);
        rectang.setWidth(10);

        //Testing getters
        System.out.println(rectang.getLength());
        System.out.println(rectang.getWidth());

        //Testing toString again
        System.out.println(rectang.toString());

        //Testing new area and permitier methods
        System.out.println("Area: " + rectang.getArea());
        System.out.println("Perimiter: " + rectang.getPerimiter());

        rectang.printRectangle();

    }

}
    

