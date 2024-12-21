import java.util.Scanner;
class First 
{
	public static void main(String as[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the 1st No: "); 
		int x=ob.nextInt();
		System.out.print("Enter the 2nd No: ");
		int y=ob.nextInt();
		System.out.println("Addition of "+x+" & "+y+" is : "+(x+y));
		System.out.println("Subtraction is : "+(x-y));
		System.out.println("Multiplication is : "+(x*y));
		System.out.print("Division is : "+(x/y));
	}
}                                   