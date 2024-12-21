//Acromatic String -> input ---> Soumodip das, output ---> S.DAS

import java.util.Scanner;
class Acro1 
{
	public static void main(String as[])
	{
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String x = ob.nextLine();
		int i,j=0;
		x = x.toUpperCase();
		System.out.print("String is : ");
		System.out.print(x.charAt(0));
		for (i=1; i<x.length(); i++)
		{	
			if(x.charAt(i)==' ')
			{
				System.out.print("."+x.charAt(i+1));
				j=i;
			}
		}
		for (i=j+2; i<x.length(); i++)
		{
			System.out.print(x.charAt(i));
		}
	}
}