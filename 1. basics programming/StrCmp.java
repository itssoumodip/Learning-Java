import java.util.Scanner;

class StrCmp 
{
	public static void main(String as[])
	{
		String x, y;
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the 1st String : ");
		x = ob.nextLine();
		System.out.print("Enter the 2nd String : ");
		y = ob.nextLine();
		if (x.equals(y))
			System.out.print("String Matched");
		else 
			System.out.print("String Not Matched");
	}
}