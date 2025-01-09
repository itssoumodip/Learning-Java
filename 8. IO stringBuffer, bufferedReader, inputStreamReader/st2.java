
import java.util.Scanner;

class st2 {

    public static void main(String[] soumodip) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String v1 = ob.nextLine();
        StringBuffer stob = new StringBuffer(v1);
        System.out.println("The Given String = " + stob);
        System.out.println("capacity = " + stob.capacity());
        System.out.println("Substring = " + stob.substring(5, 10));
        System.out.println("Substring = " + stob.substring(5));
        System.out.println("Reverse = " + stob.reverse());
        System.out.println("Length = " + stob.length());
        System.out.println("Length = " + v1.length());
        System.out.println("5 char at = " + stob.charAt(5));

    }
}
