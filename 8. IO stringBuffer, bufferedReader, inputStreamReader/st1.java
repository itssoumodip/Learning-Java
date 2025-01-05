// StringBuffer Manipulation Example

import java.util.Scanner;
class st1 {
    public static void main(String[] soumodip) {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the String : ");
        String v1 = ob.nextLine();
        StringBuffer stob = new StringBuffer(v1);
        System.out.println(stob);
        System.out.println(stob.capacity());// Initial capacity = 16 (default) + 8 (length of "soumodip") = 24
        System.out.println("Enter the String to append : ");
        String v2 = ob.nextLine();
        stob.append(" "+v2);
        System.out.println(stob);
        stob.insert(1, 'a');
        System.out.println(stob);
        stob.replace(1, 6, "12345");
        System.out.println(stob);
        stob.delete(1, 6);
        System.out.println(stob);
        System.out.println(stob.capacity()); //its not chaange because we not store anything
    }
}