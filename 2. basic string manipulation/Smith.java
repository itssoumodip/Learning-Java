import java.util.Scanner;

class Smith {

    Smith() {
    }

    public void Check(int var1) {
        int var2 = 0;
        int var4 = 0;
        int var6 = 2;

        int var3;
        for (var3 = var1; var1 > 0; var1 /= 10) {
            var2 += var1 % 10;
        }

        while (true) {
            while (var3 > 1) {
                if (var3 % var6 == 0) {
                    int var5;
                    for (var5 = var6; var6 > 0; var6 /= 10) {
                        var4 += var6 % 10;
                    }

                    var6 = var5;
                    var3 /= var5;
                } else {
                    ++var6;
                }
            }

            boolean var7 = var2 == var4;
            if (var7) {
                System.out.println("Smith No.");
            } else {
                System.out.println("NO. Smith No.");
            }

            return;
        }
    }

    public static void main(String[] var0) {
        Scanner var2 = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int var1 = var2.nextInt();
        Smith var3 = new Smith();
        var3.Check(var1);
    }
}
