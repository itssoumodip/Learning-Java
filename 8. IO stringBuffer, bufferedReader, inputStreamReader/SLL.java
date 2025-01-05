//Kaprekar No.
/*
   45--> 45^2=2025   
   99-->99^2=9801
   297^2=88209       209+88=297
 */
import java.io.*;

class SLL {

    public static void main(String soumodip[]) throws IOException {
        int x, c = 0, sq;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter the No. : ");
        int n = Integer.parseInt(br.readLine());
        for (x = n; n > 0; n /= 10) {
            c++;
        }
        sq = x * x;
        int p = (int) Math.pow(10, c);
        int rem = sq % p;
        int div = sq / p;
        System.out.print((x == rem + div) ? x + " is Kaprekar No." : x + " is NOT Kaprekar No.");

    }
}
