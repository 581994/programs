import java.util.*;
class DayOfWeek
{
	public static void main(String... a)
	{
		int m=Integer.parseInt(a[0]);
		int d=Integer.parseInt(a[1]);
		int y=Integer.parseInt(a[2]);
		int y0,x,m0,d0;

		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=m+12*((14-m)/12)-2;
		d0=(d+x+31*m0/12)%7;
		
		//System.out.println(d0);
		if(d0==0)
		{
			System.out.println("Sunday");
		}
		else if(d0==1)
		{
			System.out.println("Monday");
		}
		else if(d0==2)
		{
			System.out.println("Tuesday");
		}
		else if(d0==3)
		{
			System.out.println("Wednesday");
		}
		else if(d0==4)
		{
			System.out.println("Thursday");
		}
		else if(d0==5)
		{
			System.out.println("Friday");
		}
		else 
		{
			System.out.println("Saturday");
		}
	
		
		
	}
}