
class B0 implements Runnable 
{

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Run Method " + i);
        }
    }
}

class B1 {

    public static void main(String soumo[]) {
        B0 ob = new B0();
        Thread t = new Thread(ob);
        t.start();
        for (int i = 0; i < 11; i++) {
            System.out.println("MAIN METHOD " + i);
        }
   }
}