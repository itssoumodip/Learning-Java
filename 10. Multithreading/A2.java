class A2 
{
    public static void main (String soumo[])
    {
        for (int i = 1; i<11; i++)
        {
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
            System.out.println(" "+i);
        }
    }
}