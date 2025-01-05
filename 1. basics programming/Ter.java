import java.util.Scanner;
class Ter 
{
	public static void main (String as [])
	{
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the 1st No : ");
		int x = ob.nextInt();
		System.out.print("Enter the 2nd No : ");
		int y = ob.nextInt();
		int z = (x>y)?1:(x==y)?2:0;
		if (z==1)
			System.out.print(x+" is Greater");
		else if (z==2)
			System.out.print("Both are Equal");
		else 
			System.out.print(y+" is Greater");
	}
}