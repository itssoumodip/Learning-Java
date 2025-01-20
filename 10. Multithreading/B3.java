class B2 implements Runnable
{
    public void run()
    {
        for (int i=1; i<11; i++)
        {
            try 
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println("Run Method "+i);
        }
    }
}
class B3 
{
    public static void main (String soumo[])
    {
        B2 ob = new B2();
        Thread t = new Thread(ob);
        t.start();
        for (int i=1; i<11; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {}
            System.out.println("Main Executed "+i);
        }
    }
}