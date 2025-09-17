package lab1;

public class ThermTest 
{
	public static void main(String args[]) 
	{

	Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
	Thermometer thermB = new Thermometer();
	
	double tempB;

	System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
	thermA.setCelsius(20.0);
	System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
	thermB.setCelsius(10.0);
	tempB = thermB.getCelsius(); 
	System.out.println("Temp. of Thermometer B is " + tempB);
	

	}
}
