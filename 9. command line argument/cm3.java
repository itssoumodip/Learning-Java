class cm3 {
    public static void main(String[] var) {
        try {
            double v1 = Double.parseDouble(var[0]);
            double v2 = Double.parseDouble(var[1]);
            if (v1>v2)
                System.out.println(var[0] + " is Greater");
            else if (v2>v1)
                System.out.println(var[1] + " is Greater");
            else
                System.out.println("Both are Equall");
        } catch (NumberFormatException e) {
            System.out.println("Must be a No.");
        } catch (Exception e) {
            System.out.println("No arguments were passed.");
        }
    }
}