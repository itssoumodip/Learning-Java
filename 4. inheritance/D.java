//Multilevel Inheritance 
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
}
class C extends B
{
	public int mu;
	public void multi ()
	{
		mu = a * b;
	}
}
class D extends C
{
	public int di;
	public void div()
	{
		di = a / b;
	}
	public void show()
	{
		System.out.println("Addition is : "+ad);
		System.out.println("Substraction is : "+sb);
		System.out.println("Multiplication is : "+mu);
		System.out.println("Division is : "+di);
	}
	public static void main(String soumodip[])
	{
		D ob = new D();
		ob.input();
		ob.add();
		ob.sub();
		ob.multi();
		ob.div();
		ob.show();
	}
}
