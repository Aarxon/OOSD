package lab5;

public class Point
{
    protected int x;
    protected int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Setters
    public void setX(int x)
    {
        this.x = x;
    }

      public void setY(int y)
    {
        this.y = y;
    }

    //Getters
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "X: " + x + " Y: " + y;

    }
}