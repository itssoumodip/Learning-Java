//Name First Letter without print
import java.util.Scanner;
public class Main 
{
	public static void main(String as[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x = ob.nextLine();
		for (int i = 0 ; i < x.length()-1 ; i++)
		{
			char upperCaseChar = (char)(x.charAt(i+1)-32);
			System.out.print(upperCaseChar);
		} 
	}
	
}