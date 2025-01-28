public class calc 
{
    public int len, br, ar, pr;
    public calc() // Default constractor
    {
        ar = 0;
        pr = 0;
    } 
    public calc (int x, int y) // parameterzied constractor
    {
        ar = x * y;
        pr = 2*(x+y);
        System.out.println("Area = "+ar+", Perimeter = "+pr);
    }
    public calc (calc obj)
    {
        int a = obj.len;
        int b = obj.br;
        ar = a * b;
        br = 2*(a+b);
        System.out.println("Area is "+ar+"Perimeter is "+pr);
    }
    public static void main(String soumo[])
    {
        Scanner ob = new Scanner(System.in);
        calc ob1 = new calc(); // Default Constractor Calling
        System.out.print("Enter the Length of Rect. : ");
        ob1.len = ob.nextInt(); 
        System.out.print("Enter the Breadth of Rect. : ");
        ob2.br = ob.nextInt();
        calc ob2 = new calc (ob1.len, ob1.br); // Parameterzied Constractor Calling
        calc ob3 = new calc (ob); //copy constractor calling
        calc ob4 = new calc (ob2); //Once again copy constactor calling
    }
}