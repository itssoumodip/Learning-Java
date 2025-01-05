import java.util.InputMismatchException;
import java.util.Scanner;
class Ex6_Throw
{
    public static void main(String[] soumodip) {
        while (true)
        {
            try
            {
                Scanner ob = new Scanner (System.in);
                System.out.print("Enter the No. : ");
                int x = ob.nextInt();
                if (x<10)
                    throw new NullPointerException();
                else 
                {
                    System.out.println("Valid Input");
                    break;
                }
            }
            catch(NullPointerException e)
            {
                System.out.println("Invalid input no. must be greater then equals to 10");
            }
            catch(InputMismatchException e)
            {
                System.out.println("Input Mismatch");
            }
        }

    }
}