import java.util.*;
class Circle 
{
	public static void main (String as[])
	{
		Scanner ob = new Scanner (System.in);
		double r, ar, pr;
		System.out.print("Enter the Radius : ");
		r = ob.nextDouble();                       
		ar = 3.14*r*r;
		pr = 2*3.14*r;
		System.out.println("Area of Circle is : "+ar);
		System.out.print("Parameter of Circle is : "+pr);
	}
}