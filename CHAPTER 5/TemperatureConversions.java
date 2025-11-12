import java.util.Scanner;

public class TemperatureConversions {

    // (a) Convert Fahrenheit to Celsius
    public static int celsius(int fahrenheit) {
        return (int) ((5.0 / 9.0) * (fahrenheit - 32)); // Cast to int
    }

    // (b) Convert Celsius to Fahrenheit
    public static int fahrenheit(int celsius) {
        return (int) ((9.0 / 5.0) * celsius + 32); // Cast to int
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1: Convert Fahrenheit to Celsius");
        System.out.println("2: Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                int f = input.nextInt();
                int c = celsius(f);
                System.out.printf("%d°F is %d°C%n", f, c);
                break;

            case 2:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                int celsiusTemp = input.nextInt();
                int fahrenheitTemp = fahrenheit(celsiusTemp);
                System.out.printf("%d°C is %d°F%n", celsiusTemp, fahrenheitTemp);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        input.close();
    }
}
