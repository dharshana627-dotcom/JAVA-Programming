import java.util.*;
public class SQL11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Sanitized Inputs:");
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String sanitized = input.replace("'", "''");
            System.out.println(i + ". " + input + " -> " + sanitized);
        }
    }
}
