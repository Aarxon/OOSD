package lab3;
import java.util.Calendar;

//Driver program to test the Time class.
public class Clock
{
	public static void main (String args[])
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
		int startMinute;
		
		//Get the starting minute
		startMinute = t.getMinute();

		
		//While get minute is less than or equal to the start minute
		while(t.getMinute() <= startMinute)
		{
		t.tick();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
		}
	}
		
}
}
    
