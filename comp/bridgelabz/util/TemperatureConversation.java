
/***************************************************************
* Purpose: Program for temperature conversation

* @author   Akash
* @version  7.0
* @since    13-08-2017
*****************************************************************/

import java.util.*;
class TemperatureConversation
{
	static Scanner sc;

		public static void main(String a[])
		{
			 sc=new Scanner(System.in);
			System.out.println("select choice");
			System.out.println("Enter 1 for celsius to Fahrenheil and 2 for Fahrenheil to celsius");
			int ch=sc.nextInt();
			display(ch);  
		}

		static void display(int n)
		{
			//Scanner sc=new Scanner(System.in);
			if(n==1)
			{
				System.out.println("Enter celcious value");
				int c=sc.nextInt();
				int f=(c*9/5)+32;
				System.out.println("Fahrenheil = "+f);
			}

			else if(n==2)
			{
				System.out.println("Enter Fahrenheil value");	
				int f=sc.nextInt();
				int c=(f-32)*5/9;
				System.out.println("celcious = "+c);
					
			}

			else
			{
				System.out.println("Plz enter correct choice");
			}
		}

}