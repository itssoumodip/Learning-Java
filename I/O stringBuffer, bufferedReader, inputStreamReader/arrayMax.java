import java.io.*;
class arrayMax
{
    public void check() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Enter the Range : ");
        int n = Integer.parseInt(br.readLine());
        int i;
        int x [] = new int[n];
        System.out.println("Enter the No");
        for (i=0; i<n; i++)
        {
            x[i]=Integer.parseInt(br.readLine());
        }
        int max = x[0];
        int j = 0;
        for (i=0; i<n; i++)
        {
            System.out.print(x[i]+" ");
            if(max<x[i])
            {
                max = x[i];
                j = i;
            }
        }
        System.out.println("\nMax Value : "+max+"\tMax Index : "+j);
    }
    public static void main(String soumodip[]) throws IOException
    {
        arrayMax ob = new arrayMax();
        ob.check();
    }
}