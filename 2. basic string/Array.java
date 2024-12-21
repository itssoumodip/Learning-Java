import java.util.Scanner;

class Array
{
	public int arr[], n, i;
	public void input()
	{
		Scanner ob = new Scanner (System.in);
		System.out.print ("Enter the Range : ");
		n = ob.nextInt();
		arr = new int[n];
		System.out.print("Enter "+n+" No : ");
		i = 0;
		while(i<n)
			arr[i++] = ob.nextInt();
		
	}
	public void display()
	{
		i = 0;
		while(i<n)
			System.out.print(arr[i++]+" ");
	}
	public void check()
	{
		int max = arr[0];
		int j = 0;
		for (i=0; i<n; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
				j = i;
			}
		}
		System.out.print("\nMax Element : "+max+" Index : "+j+" Possition "+(j+1));

	}
	public static void main(String as[])
	{
		Array ob = new Array ();
		ob.input();
		ob.display();
		ob.check();
	}
}