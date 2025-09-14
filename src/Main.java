//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class CreditCardInterest {
    public static void main(String[] args) {
        // Initial balance
        double balance = 5000.00;

        // Annual interest rate
        final double ANNUAL_RATE = 0.17;

        // Monthly interest rate
        double monthlyRate = ANNUAL_RATE / 12;

        // Interest after 1 month
        double month1Balance = balance * (1 + monthlyRate);
        double interestMonth1 = month1Balance - balance;

        // Interest after 2 months
        double month2Balance = month1Balance * (1 + monthlyRate);
        double interestMonth2 = month2Balance - balance;

        // Output the results
        System.out.println("Initial Credit Card Balance: $" + String.format("%.2f", balance));
        System.out.println("Annual Interest Rate: 17%");

        System.out.println("\nAfter 1 Month:");
        System.out.printf("  Interest Due: $%.2f%n", interestMonth1);
        System.out.printf("  New Balance:  $%.2f%n", month1Balance);

        System.out.println("\nAfter 2 Months:");
        System.out.printf("  Total Interest Due: $%.2f%n", interestMonth2);
        System.out.printf("  New Balance:        $%.2f%n", month2Balance);
    }
}
