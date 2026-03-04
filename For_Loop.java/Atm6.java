import java.util.Scanner;
public class Atm6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        int n = sc.nextInt();
        int success = 0;
        int failed = 0;
        double totalwd = 0;

        for (int i = 1; i <= n; i++) {
            double amt = sc.nextDouble();
            System.out.println("Transaction " + i + ": $" + amt);
            if (amt <= balance) {
                balance -= amt;
                totalwd += amt;
                success++;
                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                failed++;
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $" + balance);
            }
            System.out.println("\n");
        }
        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failed);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + totalwd);
    }
}