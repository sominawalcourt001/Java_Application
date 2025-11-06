import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int totalNumbers = input.nextInt();

        System.out.print("Enter the first number: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= totalNumbers; i++) {
            System.out.print("Enter next number: ");
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number; // update smallest value
            }
        }

        System.out.println("\nThe smallest number is: " + smallest);
    }
}
