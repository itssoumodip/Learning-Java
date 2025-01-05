import java.util.Scanner;
public class Twisted 
{
	public int check (int x)
	{
		if (prime(x)==1)
		{
			int rev = reverse(String.valueOf(x)); 
			if (prime(rev)==1)
				return 1;
			
		}
		return 0;
	}
	public int reverse (String x)
	{
		String z = "";
		int i = x.length()-1;
		while (i>=0)
		{
			z = z + x.charAt(i);
			i--;
		}
		int y = Integer.parseInt(z);
		return y;
	}
	public int prime (int n)
	{
		int i = 1, c = 0;
		while(i<=n)
		{
			if (n%i==0)
				c++;
			i++;
		}
		return (c==2)? 1: 0;
	}
	public static void main (String soumodip[])
	{
		Twisted ob1 = new Twisted ();
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the No. to be Check : ");
		int x = ob.nextInt();
		if (ob1.check(x)==1) 
			System.out.print(x + " is a Twisted Prime NO."); 			else 
			System.out.print(x+" is Not a Twisted Prime No.");
	} 
}