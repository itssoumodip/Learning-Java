
import java.util.Scanner;

class Ex7_Finally {

    public void check(int var1) {
        try {
            if (var1 < 10) {
                throw new NullPointerException();
            }
            System.out.println("Valid Input");
        } catch (NullPointerException e1) {
            System.out.println("Invalid input no. must be greater then equals to 10");
        } catch (Exception e) {
            System.out.println("Input Mismatch");
        } finally {
            System.out.println("HI im Finally !!");
            System.exit(0);
        }
    }

    public static void main(String[] soumodip) {
        Scanner ob = new Scanner(System.in);
        Ex7_Finally ob1 = new Ex7_Finally();

        while (true) {
            System.out.print("Enter the No. : ");
            int x = ob.nextInt();
            ob1.check(x);
        }
    }
}
