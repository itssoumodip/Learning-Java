class B3 implements Runnable
{
    public void run()
    {
        for (int i=1; i<11; i++)
        {
            try 
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {}
            System.out.println("Run Method "+i);
        }
    }
}
class B4 
{
    public static void main (String soumo[])
    {
        B3 ob = new B3();
        Thread t = new Thread(ob);
        t.start();
        for (int i=1; i<11; i++)
        {
            try 
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            if (i%2==0)
                System.out.println("MAIN EVEN CASE "+i);
            else 
                System.out.println("MAIN ODD CASE "+i);
        }
    }
}