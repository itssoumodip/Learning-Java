//Multiple Inheritanvce 
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
interface C 
{
    public final double pi = 3.14;
    public void calc_cir(double r);
}
class D2 extends B implements C
{
    public double cir_ar, cir_pr;
    public void calc_cir(double r)
    {
        cir_pr = 2*pi*r;
        cir_ar = pi*r*r;
    }
    public void show()
    {
        System.out.println("Area of rect. "+ar+"\tperimeter of rect. : "+pr);
        System.out.println("Area of sq. "+sq_ar+"\t\tperimeter of sq. : "+sq_pr);
        System.out.println("Area of circ. "+cir_ar+"\tperimeter of circ. : "+cir_pr); 
    }
    public static void main(String soumodip[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the Radius : ");
        double rad = ob.nextDouble();
        D2 obj = new D2();
        obj.input_A();
        obj.input_B();
        obj.calc_A();
        obj.calc_B();
        obj.calc_cir(rad);
        obj.show();
    }
}
