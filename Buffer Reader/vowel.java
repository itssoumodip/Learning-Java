
import java.io.*;

public class vowel
{
    public void check() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Character : ");
        char x = (char)br.read();
        switch(x)
        {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println(x+" is Vowel");
                break;
            default:
                System.out.println(x+" is Consonent");
        }  
    }
    public static void main(String soumodip[]) throws IOException
    {
        vowel ob = new vowel();
        ob.check();
    }
}