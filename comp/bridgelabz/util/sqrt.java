
/***************************************************************
* Purpose: Find suare root using newton's law
* @author   Akash
* @version  7.0
* @since    13-08-2017
*****************************************************************/

import java.util.*;
class mm
{
	double epslion=1e-15;
	
	void SquareRoot(int c)
	{
		 int t=c;
		while(Math.abs(t-c/t)>epslion*t)
		{
			t=(c/t+t)/2;
		}
		System.out.println(t);	
	}
	
}

class sqrt
{
	public static void main(String a[])
	{
		int c=Integer.parseInt(a[0]);
		
		mm sq=new mm();
		sq.SquareRoot(c);
	
	}

}