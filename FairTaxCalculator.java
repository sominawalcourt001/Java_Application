import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transportation, education, healthcare, vacations;
        double totalSpending, fairTax;

        System.out.println("🏠 FairTax Estimator 💰");
        System.out.println("Enter your estimated monthly expenses below:");

        System.out.print("Housing: ");
        housing = input.nextDouble();

        System.out.print("Food: ");
        food = input.nextDouble();

        System.out.print("Clothing: ");
        clothing = input.nextDouble();

        System.out.print("Transportation: ");
        transportation = input.nextDouble();

        System.out.print("Education: ");
        education = input.nextDouble();

        System.out.print("Healthcare: ");
        healthcare = input.nextDouble();

        System.out.print("Vacations: ");
        vacations = input.nextDouble();

        // Calculate totals
        totalSpending = housing + food + clothing + transportation + education + healthcare + vacations;
        fairTax = totalSpending * 0.23; // 23% FairTax

        System.out.println("\n----- FairTax Estimate -----");
        System.out.printf("Total Spending: $%.2f%n", totalSpending);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);
        System.out.printf("Total Cost After Tax: $%.2f%n", totalSpending + fairTax);

        System.out.println("\nNote:");
        System.out.println("- The 23% FairTax is based on the official FairTax proposal.");
        System.out.println("- Some critics argue the effective rate is closer to 30% due to how the tax is applied.");
        System.out.println("- Learn more at: https://www.fairtax.org/");
    }
}
