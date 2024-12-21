import java.util.*;
class Compare
{
	public static boolean check (String x, String y)
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
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the 1st String : ");
		String a = ob.nextLine();
		System.out.print("Enter the 2nd String : ");
		String b = ob.nextLine();	
		
		if(check(a,b))
			System.out.print("String Matched");
		else 
			System.out.print("String Not Matched");
	}
}