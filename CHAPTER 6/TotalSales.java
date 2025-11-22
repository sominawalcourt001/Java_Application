import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SALESPEOPLE = 4;
        final int PRODUCTS = 5;

        double[][] sales = new double[PRODUCTS][SALESPEOPLE]; // [product][salesperson]

        System.out.println("Enter sales data for last month.");
        System.out.println("Enter -1 for salesperson number to finish input.");

        while (true) {
            System.out.print("Enter salesperson number (1-4, -1 to quit): ");
            int salesperson = input.nextInt();
            if (salesperson == -1) break;

            if (salesperson < 1 || salesperson > SALESPEOPLE) {
                System.out.println("Invalid salesperson number. Try again.");
                continue;
            }

            System.out.print("Enter product number (1-5): ");
            int product = input.nextInt();

            if (product < 1 || product > PRODUCTS) {
                System.out.println("Invalid product number. Try again.");
                continue;
            }

            System.out.print("Enter total dollar value of product sold: ");
            double amount = input.nextDouble();

            // Store in array
            sales[product - 1][salesperson - 1] += amount;
        }

        // Display table header
        System.out.printf("%-10s", "Product");
        for (int sp = 1; sp <= SALESPEOPLE; sp++) {
            System.out.printf("%10s", "SP" + sp);
        }
        System.out.printf("%15s%n", "Total");

        // Calculate totals
        double[] salespersonTotals = new double[SALESPEOPLE];
        double[] productTotals = new double[PRODUCTS];

        for (int product = 0; product < PRODUCTS; product++) {
            System.out.printf("%-10s", "Product " + (product + 1));
            double rowTotal = 0;

            for (int sp = 0; sp < SALESPEOPLE; sp++) {
                double value = sales[product][sp];
                System.out.printf("%10.2f", value);
                rowTotal += value;
                salespersonTotals[sp] += value;
            }

            productTotals[product] = rowTotal;
            System.out.printf("%15.2f%n", rowTotal);
        }

        // Print salesperson totals at the bottom
        System.out.printf("%-10s", "Total");
        double grandTotal = 0;
        for (int sp = 0; sp < SALESPEOPLE; sp++) {
            System.out.printf("%10.2f", salespersonTotals[sp]);
            grandTotal += salespersonTotals[sp];
        }
        System.out.printf("%15.2f%n", grandTotal);
    }
}
