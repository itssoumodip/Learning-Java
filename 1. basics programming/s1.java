//WAP to take a string input & print the Length
import java.util.Scanner;
class s1
{
	public static void main(String as[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x = ob.nextLine();
		System.out.println("String : "+x+", Length : "+x.length());
		System.out.println("Before String : "+x+", After String : "+x.trim());
		x = x.trim();
		//print
		for(int i=0; i<x.length(); i++)
		{
			System.out.print(x.charAt(i));
		}
		
	}
}