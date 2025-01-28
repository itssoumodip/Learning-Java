class N1 implements Runnable
{
    Thread t;
    N1()
    {
        t = new Thread(this, "Soumodip");
        t.start();
    }
    public void run()
    {
        String s = t.getName();
        System.out.println("Thread Name : "+s+" value : "+i);
    }
    
}