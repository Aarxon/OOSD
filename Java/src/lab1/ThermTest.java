package lab1;

public class ThermTest 
{
	public static void main(String args[]) 
	{

	Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

	System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
	thermA.setCelsius(20.0);
	System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

	}
}
