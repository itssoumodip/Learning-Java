import java.util.Scanner;
class Ex4
{
    public static void main(String[] soumodip) {
        
        try
        {
            Scanner ob = new Scanner (System.in);
            System.out.print("Enter the String : ");
            String x = ob.nextLine();
            for (int i=0; i<x.length()+1; i++)
                System.out.print(x.charAt(i));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.print("\nString out of Range");
        }
    }
}