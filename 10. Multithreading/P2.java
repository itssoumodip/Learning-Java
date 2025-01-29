class P1 implements Runnable 
{
    Thread t;
    public P1(String s, int n)
    {
        t = new Thread(this, s);
        t.setPriority(n);
        t.start();
    }
    public void run()
    {
        for (int i=0; i<11; i++)
        {
            String s1 = t.getName();
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {}
            System.out.println("Thread Name : "+s1+" Value : "+i+" Priority : "+t.getPriority());
        }
    }
}
class P2 
{
    public static void main(String soumo[])
    {
        P1 ob1 = new P1 ("santonu", 5);
        P1 ob2 = new P1 ("soumodip", 10); 
        P1 ob3 = new P1 ("prodip", 1); 
    }
}