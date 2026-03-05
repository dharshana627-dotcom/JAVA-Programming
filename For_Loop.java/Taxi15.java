import java.util.Scanner;
public class Taxi15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double tdist = 0;
        double treve = 0;

        for (int i = 1; i <= n; i++) {
            double km = sc.nextDouble();
            String time = sc.next();
            double base = 3.0;
            double distCharge = km;
            double surcharge = 0;

            if (time.equals("Evening")) surcharge = 3;
            else if (time.equals("Night")) surcharge = 5;

            double total = base + distCharge + surcharge;
            tdist += km;
            treve += total;

            System.out.println("Ride "+i);
            System.out.println("Distance: "+km+" km");
            System.out.println("Time: "+time);
            System.out.println("Base Fare: $"+base);
            System.out.println("Distance Charge: $"+distCharge);
            System.out.println("Time Surcharge: $"+surcharge);
            System.out.println("Total Fare: $"+total);
            System.out.println("\n");
        }
        double avg = treve/n;
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+tdist+" km");
        System.out.println("Total Revenue: $"+treve);
        System.out.println("Average Fare: $"+avg);
    }
}