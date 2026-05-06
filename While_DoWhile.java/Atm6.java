import java.util.*;
public class Atm6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw;
        System.out.println("Balance: " + balance);
        do {
            System.out.print("Enter withdrawal amount: ");
            withdraw = sc.nextInt();
            if (withdraw > balance) {
                System.out.println("Insufficient funds! Try again.");
            } 
            else if (withdraw < 200) {
                System.out.println("Invalid amount! Try again.");
            }
        } while (withdraw > balance || withdraw < 200);
        balance -= withdraw;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}
