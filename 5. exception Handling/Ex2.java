import java.util.InputMismatchException;
import java.util.Scanner;
class Ex2
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
        catch(InputMismatchException e) 
        {
            System.out.print("Given Wrong Input ");
        }
        catch(ArithmeticException e) 
        {
            System.out.print("Division by 0 can't be possible");
        }
        catch(Exception e) 
        {
            System.out.print("Exception Occured ");
        }
    }
}