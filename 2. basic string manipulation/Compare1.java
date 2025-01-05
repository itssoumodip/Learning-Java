import java.util.*;
class Compare1
{
	public String a, b;

	public boolean check (String x, String y)
	{
		x = x.toUpperCase();
		y = y.toUpperCase();
		if (x.equals(y))
			return true;
		else 
			return false;
	} 
	public static void main(String as [])
	{
		Compare1 obj = new Compare1();
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the 1st String : ");
		obj.a = ob.nextLine();
		System.out.print("Enter the 2nd String : ");
		obj.b = ob.nextLine();	
		
		if(obj.check(obj.a, obj.b))
			System.out.print("String Matched");
		else 
			System.out.print("String Not Matched");
	}
}