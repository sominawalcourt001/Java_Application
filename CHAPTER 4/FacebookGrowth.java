public class FacebookGrowth {
    public static void main(String[] args) {
        double initialUsers = 1_000_000_000; // 1 billion
        double rate = 0.04; // 4% monthly growth

        double target1 = 1.5 * initialUsers; // 1.5 billion
        double target2 = 2.0 * initialUsers; // 2 billion

        // Formula: n = log(A/P) / log(1 + r)
        double monthsTo1_5B = Math.log(target1 / initialUsers) / Math.log(1 + rate);
        double monthsTo2B = Math.log(target2 / initialUsers) / Math.log(1 + rate);

        System.out.printf("Months to reach 1.5 billion users: %.2f months%n", monthsTo1_5B);
        System.out.printf("Months to reach 2 billion users: %.2f months%n", monthsTo2B);
    }
}
