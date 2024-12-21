//Acromatic String -> input ---> Soumodip das, output ---> S.D

import java.util.Scanner;
class Acro 
{
	public static void main(String as[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x = sc.nextLine();
		System.out.println("String : "+x);
		x=" "+x.toUpperCase();
		//System.out.println("String : "+x);
	
		System.out.print("Acro String is : ");
		for (int i=0; i<x.length(); i++)
		{
			if(x.charAt(i)==' ')
				System.out.print(x.charAt(i+1)+".");
		}
		
	}
}