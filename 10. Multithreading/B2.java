class B1 implements Runnable 
{
    public void run()
    {
        for (int i=0; i<11; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {System.out.println("HI");}
            System.out.println("Run Method " + i);
        }
    }
}
class B2 
{
    public static void main(String soumo[])
    {
        B1 ob = new B1();
        Thread t = new Thread(ob);
        t.start();
        for (int i=0; i<11; i++)
            System.out.println("MAIN METHOD "+i);
    }
}