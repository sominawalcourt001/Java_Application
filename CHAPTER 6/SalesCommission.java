import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counters = new int[9]; // index 0-8 for the salary ranges

        System.out.print("Enter number of salespeople: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter gross sales for salesperson " + (i + 1) + ": ");
            double gross = input.nextDouble();

            int salary = (int)(200 + 0.09 * gross); // truncate to integer

            int index;

            if (salary >= 1000) {
                index = 8; // 1000+
            } else {
                index = (salary - 200) / 100;
                if (index < 0) index = 0;  // safety check
            }

            counters[index]++;
        }

        // Print result table
        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("-------------------------------------");

        for (int i = 0; i < counters.length; i++) {
            if (i == 8) {
                System.out.printf("$1000 and over:\t%d%n", counters[i]);
            } else {
                int rangeStart = 200 + i * 100;
                int rangeEnd = rangeStart + 99;
                System.out.printf("$%d–%d:\t\t%d%n", rangeStart, rangeEnd, counters[i]);
            }
        }
    }
}
