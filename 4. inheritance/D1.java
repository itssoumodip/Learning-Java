//Multiple Inheritanvce (Wrong Code)
import java.util.Scanner;
class A
{
    public int len, br, ar, pr;
    public void input_A()
    {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the Length : ");
        len = ob.nextInt();
        System.out.print("Enter the Breadth : ");
        br = ob.nextInt();
    }
    public void calc_A()
    {
        ar = len*br;
        pr = 2*(len+br);
    }
}
class B extends A
{
    public int sq_ar, sq_pr, side;
    public void input_B()
    {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the Side : ");
        side = ob.nextInt();
    }
    public void calc_B()
    {
        sq_ar = side*side;
        sq_pr = 4*side;
    }
}
class C extends A
{
    public double rad, cir_ar, cir_pr;
    public final double pi = 3.14;
    public void input_C()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        rad = ob.nextDouble();
    }
    public void calc_C()
    {
        cir_pr = 2*pi*rad;
        cir_ar = pi*rad*rad;
    }
}
class D1 extends B
{

}