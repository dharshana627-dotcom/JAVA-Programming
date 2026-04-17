import java.util.*;
public class Flight7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Flight Details:");
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String parts[] = input.split("-");
            String airline = parts[0].substring(0, 2);
            String flightNo = parts[0].substring(2);
            String from = parts[1];
            String to = parts[2];
            System.out.println(i + ". Airline: " + airline + ", Flight: " + flightNo + ", From: " + from + ", To: " + to);
        }
    }
}