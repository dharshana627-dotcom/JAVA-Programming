import java.util.*;
public class Credit10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Masked Data:");
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String clean = input.replaceAll("[^0-9]", "");
            String last4 = clean.substring(clean.length() - 4);
            String result;
            if (input.contains("-")) {
                result = "---" + last4;
            } else if (input.contains(" ")) {
                result = "   " + last4;
            } else {
                result = last4;
            }
            System.out.println(i + ". " + result);
        }
    }
}
