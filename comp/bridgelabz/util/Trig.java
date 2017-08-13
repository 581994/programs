
/***************************************************************
* Purpose: Program for various trignometric function

* @author   Akash
* @version  7.0
* @since    13-08-2017
*****************************************************************/



import java.util.*;
class Trig
{
	public static void main(String... aa)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any no. to get sine value");
		int s=sc.nextInt();
		System.out.println("Sin of "+s+"= "+Math.sin(s));

		System.out.println("Enter any no. to get cos value");
		int c=sc.nextInt();
		System.out.println("Cos of "+c+"= "+Math.cos(c));
		
		System.out.println("Enter Degree to convert in radian");
		int r=sc.nextInt();
		System.out.println("Radian of "+s+"= "+Math.toRadians(r));




	}

}