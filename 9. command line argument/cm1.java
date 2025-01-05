public class cm1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Number of arguments: " + args.length);
            System.out.println("Arguments passed:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were passed.");
        }
    }
}
