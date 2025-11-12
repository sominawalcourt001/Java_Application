public class NumberSystemTable {

    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\t\tOctal\tHexadecimal");
        System.out.println("-------\t------\t\t-----\t-----------");

        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();

            System.out.printf("%-7d\t%-15s\t%-5s\t%-10s%n", i, binary, octal, hex);
        }
    }
}
