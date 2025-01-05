import java.io.*;
class concat {
    public void add (String v1, String v2) throws IOException {
        System.out.println("String : "+v1+" "+v2);
    }
    public static void main(String[] soumodip) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        concat ob1 = new concat();
        System.out.print("Enter the 1st String : ");
        String v1 = ob.readLine();
        System.out.print("Enter the 2nd String : ");
        String v2 = ob.readLine();  
        ob1.add(v1,v2);
    }
}