import java.util.Scanner;
public class revString
{
	public String reverse (String x)
	{
		String z = "";
		int i = x.length()-1;
		while (i>=0)
		{
			z = z + x.charAt(i);
			i--;
		}
		return z;
	}
	public static void main (String soumodip[])
	{
		revString ob1 = new revString ();
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String x = ob.nextLine();
		String y = ob1.reverse(x);
		System.out.print("Reverse String is : "+y);
	} 
}