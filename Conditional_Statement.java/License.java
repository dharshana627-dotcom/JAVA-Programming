import java.util.Scanner;
public class License{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int d = sc.nextInt();

        double base = 0;
        double vdis = 0;
        double sf = 0;
        double ydis = 0;

        if (b.equals("Standard")){
            base = 60;
        }else if(b.equals("Professional")){
            base = 120;
        }else{
            base = 200;
        }
        if(a >=1 && a <= 50){
            vdis = 0;
        }else if(a >= 51 && a <= 200){
            vdis = 15;
        }else if(a >=201 && a <= 500){
            vdis = 20;
        }else if(a >= 501 && a <= 1000){
            vdis = 25;
        }else if(a >= 1001){
            vdis = 35;
        }
        if (c.equals("Basic")) {
            sf = 10;
        }else if (c.equals("Priority")) {
            sf = 30;
        }else {
            sf = 80;
        }
        if (d == 2) {
            ydis = 5;
        }else if (d == 3) {
            ydis = 10;
        }else if (d == 5) {
            ydis = 20;
        }
        double dis = base * (1 - vdis / 100);
        double annual = (dis + sf) * (1 - ydis / 100);
        double tannual = annual * a;
        double tc = tannual * d;

        String tier;
        if (a < 200){
            tier = "Small Business";
        }else if (a <= 1000){
            tier = "Mid-Market";
        }else {
            tier = "Enterprise";
        }
        System.out.println("User Count: " + a);
        System.out.println("License Type: " + b);
        System.out.println("Support Level: " + c);
        System.out.println("Contract Duration: " + d + " years");
        System.out.println("Base Price Per User: $" + base);
        System.out.println("Volume Discount: " + vdis + "%");
        System.out.println("Support Fee Per User: $" + sf);
        System.out.println("Multi-Year Discount: " + ydis + "%");
        System.out.println("Annual Cost Per User: $" + annual);
        System.out.println("Total Annual Cost: $" + tannual);
        System.out.println("Total Contract Value: $" + tc);
        System.out.println("Pricing Tier: " + tier);
    }
}
    