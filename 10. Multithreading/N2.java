class N1 implements Runnable 
{
    Thread t;
    N1 (String s)
    {
        t = new Thread (this, s);
        t.start();
    }
    public void run()
    {
        for(int i=0; i<11; i++)
        {
            String s1 = t.getName();
            System.out.println("Thread Name : "+s1+" Value : "+i);
        }
    }
}
class N2
{
    public static void main(String soumo[])
    {
        N1 ob1 = new N1("Soumodip");
        N1 ob2 = new N1("Animesh");
        N1 ob3 = new N1("Santonu");
        for (int i=0; i<11; i++)
        {
            String s1 = Thread.currentThread().getName();
            System.out.println("Main Thread : "+s1+" Value : "+i);
        }
    }
}