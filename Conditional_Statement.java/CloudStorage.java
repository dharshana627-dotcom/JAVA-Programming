import java.util.Scanner;
public class CloudStorage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        double bsc = 0;
        if (a >= 10 && a <= 100) {
            bsc = a * 0.05;
        } else if (a >=101 && a <= 500) {
            bsc = (100 * 0.05) + (a - 100) * 0.04;
        } else if (a >= 501 && a <= 2000) {
            bsc = (100 * 0.05) + (400 * 0.04) + (a - 500) * 0.03;
        } else if(a >= 2001) {
            bsc = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (a - 2000) * 0.02;
        }

        double userFee;
        if (b <= 10) {
            userFee = b * 5;
        }else if (b <= 50) {
            userFee = b * 4;
        }else {
            userFee = b * 3;
        }
        double backup = 0;
        if (c.equals("Hourly")) {
            backup = 15 + 0.5 * b;
        } else if (c.equals("Real-Time")) {
            backup = 50 + 1 * b;
        }
        double sf = 0;
        if (d.equals("Standard")) {
            sf = 20;
        }else if (d.equals("Priority")) {
            sf = 75;
        }else if (d.equals("Enterprise")) {
            sf = 200;
        }
        double ms = bsc + userFee + backup + sf;
        double as = ms * 12 * 0.9;
        String plan;
        String features;
        if (b == 1) {
            plan = "Personal";
            features = "Basic storage, file sync";
        } else if (b <= 20) {
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        } else if (b <= 100) {
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        } else {
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Storage Capacity: " + a + " GB");
        System.out.println("User Count: " + b);
        System.out.println("Backup Frequency: " + c);
        System.out.println("Support Tier: " + d);
        System.out.println("Base Storage Cost: $" + bsc);
        System.out.println("Per-User Fee: $" + userFee);
        System.out.println("Backup Premium: $" + backup);
        System.out.println("Support Fee: $" + sf);
        System.out.println("Monthly Subscription: $" + ms);
        System.out.println("Annual Subscription: $" + as + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);
    }
}