class S0 
{
    public void display(String nm, int x)
    {
        System.out.print("Ms. ");
        try 
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.print(" "+nm);
        try 
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println(" "+x);
    }
}
class syn implements Runnable
{
    Thread t;
    S0 ob;
    String s;
    int prio;
    public syn (S0 obj, String s1, int p)
    {
        ob = obj;
        s = s1;
        prio = p;
        t = new Thread (this, "abc");
        t.setPriority(p);
        t.start();
    }
    public void run ()
    {
        synchronized (ob)
        {
            ob.display(s, prio);
        }
    }
}
class S1 
{
    public static void main(String soumo[])
    {
        S0 ob = new S0();
        new syn(ob,"prodip",1);
        new syn(ob,"santonu", 5);
        new syn(ob,"soumodip",10);
    }
}