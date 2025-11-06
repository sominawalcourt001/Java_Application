public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount
        int years = 10;            // number of years

        // loop through interest rates 5% to 10%
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%nInterest Rate: %.0f%%%n", rate * 100);
            System.out.printf("%-6s%-20s%n", "Year", "Amount on Deposit");

            // calculate amount for each year
            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-6d%,.2f%n", year, amount);
            }
        }
    }
}
