import java.io.*;
public class vowelArray
{
    public void check()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the String = ");
       String x=br.readLine();
       char v[]=new char[x.length()-1];
       char c[]=new char[x.length()-1];
       int i,vo=0,co=0;
       for(i=0;i<x.length();i++)
       {
         char p=x.charAt(i);
       switch(p)
       {
          case 'a':case 'e':case 'i':case 'o':case 'u':
          case 'A':case 'E':case 'I':case 'O':case 'U':
            v[vo]=p;
            vo++;
            break;
          default:
              c[co]=p;
              co++;
       }
     }
       System.out.print("Vowel List = ");
       for(i=0;i<v.length;i++)
         System.out.print(v[i]);
       System.out.println();
       System.out.print("Consonant List = ");
       for(i=0;i<c.length;i++)
         System.out.print(c[i]);
       
    }
    public static void main(String[] args) throws IOException
    {
        vowelArray ob =new vowelArray();
        ob.check();
    }
}