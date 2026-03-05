import java.util.Scanner;
public class Library14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        int overdue = 0;

        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            int days = sc.nextInt();
            double rate = 0, cap = 0;
            if (type.equals("Regular")){ 
                rate = 0.50; 
                cap = 10;
            }else if (type.equals("Reference")){ 
                rate = 1.00; 
                cap = 20; 
            }else if(type.equals("Magazine")){ 
                rate = 0.25; 
                cap = 5; 
            }
            double calc = days * rate;
            double actual = Math.min(calc, cap);
            if (days > 0) overdue++;
            total += actual;

            System.out.println("Book "+i+": "+type);
            System.out.println("Days Late: "+days);
            System.out.println("Daily Fine: $"+rate);
            System.out.println("Calculated Fine: $"+calc);
            System.out.println("Actual Fine: $"+actual);
            System.out.println("Cap Applied: "+(calc>cap ? "Yes" : "No"));
        }

        double avg = total/n;

        System.out.println();
        System.out.println("Total Books: "+n);
        System.out.println("Total Fines Collected: $"+total);
        System.out.println("Books Overdue: "+overdue);
        System.out.println("Average Fine: $"+avg);
    }
}