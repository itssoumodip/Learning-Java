class N0 implements Runnable
{
    Thread t;
    N0()
    {
        t = new Thread(this, "Soumodip");
        t.start();
    }
    public void run()
    {
        for (int i=0; i<11; i++)
        {
            String s = t.getName();
            System.out.println("Thread Name : "+s+" value : "+i);
        }
    }
}
class N1 
{
    public static void main(String soumo[])
    {
        N0 ob = new N0();
        for(int i=0; i<11; i++)
        {
            String s1 = Thread.currentThread().getName();
            // System.out.println(Thread.currentThread());
            // System.out.println(Thread.currentThread().getName());
            System.out.println("Main Thread Name : "+s1+" Value : "+i);
        }
    }
}