class P0 implements Runnable 
{
    Thread t;
    public P0(String s, int n)
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
class P1 
{
    public static void main(String soumo[])
    {
        P0 ob1 = new P0 ("santonu", 5);
        P0 ob2 = new P0 ("soumodip", 10); 
        P0 ob3 = new P0 ("prodip", 1); 
    }
}