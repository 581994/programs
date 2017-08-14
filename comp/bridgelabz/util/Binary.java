
/***************************************************************
* Purpose: Program to convert decimal to binary conversion.
* @author   Akash
* @version  7.0
* @since    13-08-2017
*****************************************************************/

import java.util.*;
class Binary 
{


	public static  void main(String args[])
	{
		int b=Integer.parseInt(args[0]);
		bin q=new bin();
		q.ConvertBin(b);		
	}	

}

class bin
{

	void ConvertBin(int a)
	{
		int b[]=new int[a];
		int index=0;
		
		while(a>0)
		{
			b[index]=a%2;
			a=a/2;
			index++;
		
		
		}
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(b[i]);
		
		}		
	}

}
