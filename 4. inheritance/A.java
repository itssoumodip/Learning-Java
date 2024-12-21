//Single Level Inheritance 
import java.util.Scanner;
class A 
{
	public int a, b, ad;
	public void input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the 1st No. : ");
		a = ob.nextInt();
		System.out.print("Enter the 2nd No. : ");
		b = ob.nextInt();
		
	}
	public void add()
	{
		ad = a + b;
	}

}

class B extends A 
{
	public int sb;
	public void sub()
	{
		sb = a - b;
	}
	public void show()
	{
		System.out.println("Addition is : "+ad);
		System.out.print("Substraction is : "+sb);
	}

	public static void main(String soumodip[])
	{
		B ob = new B();
		ob.input();
		ob.add();
		ob.sub();
		ob.show();
	}
}

