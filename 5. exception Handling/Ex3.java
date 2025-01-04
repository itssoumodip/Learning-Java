
import java.util.Scanner;

class Ex3 {

    public static void main(String[] soumodip) {
        try {
            Scanner ob = new Scanner(System.in);
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
        } catch (ArithmeticException e) {
            System.out.print("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.print("ArithmeticException");
        }

    }
}
