package lab9.Q2;

public class Car extends RoadVehicle
{
	private String carType;
 
	public Car() 
    {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) 
    { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  
    {
		carType = t;
	}
	public void calculateDuty()
	{
		double duty = 50 * CARTAXRATE;
		System.out.println("Car Duty: " + duty);
	}
	public String getType() 
    {
		return carType;
	}
}