import java.util.*;
public class Password1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "secure123";
        String input;
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter password:");
            input = sc.nextLine();
            if (input.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect! Attempts remaining: " + attempts);
                } else {
                    System.out.println("Access denied!");
                }
            }
        }
    }
}