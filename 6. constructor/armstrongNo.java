import java.util.Scanner;
class armstrongNo 
{
    public int n, x, rem, s, p, c;
    public armstrongNo()
    {
        s = 0;
        c = 0;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        n = ob.nextInt();
    }
    public armstrongNo(int n)
    {
        for (x=n; x>0; x/=10)
            c++;
        for (x=n; x>0; x/=10)
        {
            rem = x%10;
            p = (int)Math.pow(rem,c);
            s = s+p;
        }
        if (s==n)
            System.out.println(n+" is a Armstrong No.");
        else
            System.out.println(n+" is NOT a Armstrong No.");
    }
    public static void main(String soumo[])
    {
        armstrongNo ob = new armstrongNo();
        armstrongNo ob1 = new armstrongNo(ob.n);
    }

    
}
