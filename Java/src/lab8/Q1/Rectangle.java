package lab8.Q1;

public class Rectangle extends TwoDShape
{
	private double length;
	private double width;

   public Rectangle(String name, String colour, double length, double width)
  	{ 
  		super(name, colour);
		this.length = length;
		this.width = width;
  	}

	@Override
	public double area()
	{
		return length * width;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nRectangle length = " + this.length + "\nRectangle width = " + this.width;
	}
	
}