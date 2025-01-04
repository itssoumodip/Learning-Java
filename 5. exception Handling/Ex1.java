import java.util.Scanner;
class Ex1
{
    public static void main(String[] soumodip)
    {
        try
        {
            Scanner ob = new Scanner (System.in);
            System.out.print("Enter the 1st No. : ");
            int x = ob.nextInt();
            System.out.print("Enter the 2nd No. : ");
            int y = ob.nextInt();
            int z = x/y;
            System.out.print("Division : "+z);
        }
        catch(Exception e) 
        {
            System.out.print("Divison can't be Possible "+e);
        }
    }
}