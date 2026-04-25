import java.util.*;
public class Chatbot15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Cleaned Text:");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            line = line.toLowerCase();
            line = line.replaceAll("[^a-z0-9 ]", "");
            line = line.replaceAll("\\s+", " ").trim();
            System.out.println(i + ". " + line);
        }
    }
}
