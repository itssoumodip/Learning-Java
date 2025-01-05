class cm2 {
    public static void main(String[] var) {
        try {
            String v1 = var[0];
            String v2 = var[1];
            String v3 = var[0] + " " + var[1];
            System.out.print("String : "+v3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Array Element is less");
        }
    }
}