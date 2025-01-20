class A1 
{
    public static void main(String soumo[])
    {
        Thread ob = new Thread();
        System.out.println(ob.currentThread());
        ob.setName("soumodip");
        System.out.println(ob);
        ob.setPriority(10);
        int x = ob.getPriority();
        System.out.println(x);
        String y = ob.getName();
        System.out.println(y);

    }
}