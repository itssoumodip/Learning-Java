import java.util.Scanner;
class Ex5_NestedEx
{
    public static void main(String[] soumodip) {
        try
        {
            Scanner ob = new Scanner (System.in);
            System.out.print("Enter the 1st No. : ");
            int x = ob.nextInt();
            System.out.print("Enter the 2nd No. : ");
            int y = ob.nextInt();
            int z = x/y;
            System.out.println("Division : "+z);
            try 
            {
                System.out.print("Enter the Range : ");
                int n = ob.nextInt();
                int ar[] = new int[n];
                int i;
                System.out.println("Enter the No's : ");
                for (i = 0; i < n; i++) {
                    ar[i] = ob.nextInt();
                }
                for (i = 0; i < n; i++) {
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
                ar[i] = 75;
            }
            catch(ArithmeticException e)
            {
                System.out.print("Arithmetic Exception Ocured");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Array Index Out of Range");
        }
        catch (Exception e)
        {
            System.out.print("Exception !!");
        }
    }
}