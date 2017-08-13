
/***************************************************************
* Purpose: Program for various trignometric function

* @author   Akash
* @version  7.0
* @since    13-08-2017
*****************************************************************/

import java.util.*;
class LeapYear 
{

	static int isTrue;

	static int check(int y)
	{
		if(y>=1582)
		{
			if(y%4==0 && y%100!=0)
			{
				 isTrue=1;
			}

			else if(y%400==0)
			{
				 isTrue=1;
			}
		}

		else
		{
			System.out.println(" year should be greater than 1581");
		}
		return isTrue;	
	}

	
	public static void main(String args[])
	{
		int y=Integer.parseInt(args[0]);
		isTrue=0;
		
		int a=check(y);
		
		if(a==1)
		{
		System.out.println(" leap year");
		}
		else
		{
		System.out.println(" not leap year");
		}
			
	}

}