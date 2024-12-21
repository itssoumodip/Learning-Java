import java.util.Scanner;
class Palindrome
{
	public int x, sum = 0, rem;
	public int check (int n)
	{
		x = n;
		while(x>0)
		{
			rem = x%10;
			sum = (sum*10)+rem;
			x/=10;
		}
		return (n==sum)?1:0;	
	}
	public static void main (String as[])
	{
		Palindrome ob1 = new Palindrome ();
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = ob.nextInt();
		if(ob1.check(n)==1)
			System.out.print(n+" is a Palindrom No");
		else
			System.out.print(n+" is Not a Palindrom No");
		
	}
}