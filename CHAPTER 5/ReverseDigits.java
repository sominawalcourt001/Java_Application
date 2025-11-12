import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of an integer
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            number /= 10;                 // Remove last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int num = input.nextInt();

        int reversedNum = reverseNumber(num);

        System.out.printf("The reversed number is: %d%n", reversedNum);

        input.close();
    }
}
