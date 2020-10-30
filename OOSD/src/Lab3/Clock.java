package Lab3;

import java.util.Calendar;
public class Clock 
{
	public static void main(String[] args) 
	{
		long timeStart=System.currentTimeMillis();
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));
		while(true)
		{
			if(System.currentTimeMillis()-timeStart>1000)
			{
				t.tick();
				timeStart=System.currentTimeMillis();
				System.out.println(t);
			}
		}
	}

}