import java.util.Scanner;
public class MonthlySales4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double tsales = 0;
        double tcom = 0;
        String topPerf = "";
        double maxSales = 0;

        for (int i = 0; i < n; i++) {
            String repName = sc.next();
            double salesAmt = sc.nextDouble();

            double comRate=0;
            double bonus = 0;

            
            if(salesAmt>=0 && salesAmt<=40000){
                comRate=5;
            }else if(salesAmt>=40001 && salesAmt<=80000){
                comRate=8;
            }else if(salesAmt>=80001 && salesAmt<=100000){
                comRate=10;
            }else if(salesAmt>=100001 && salesAmt<=150000){
                comRate=12;
            }else if(salesAmt>=150000){
                comRate=15;
            }
            double comEarned = salesAmt * comRate / 100;
            comEarned=salesAmt*(comRate/100);

            if(salesAmt>=100000){
                bonus=2000;
            }else if(salesAmt>=150000){
                bonus=3000;
            }
            double tpay = comEarned + bonus;

            tsales += salesAmt;
            tcom += tpay;

            if (salesAmt > maxSales) {
                maxSales = salesAmt;
                topPerf = repName;
            }

            
            System.out.println("Sales Rep: " + repName);
            System.out.println("Sales Amount: $" + salesAmt);
            System.out.println("Commission Rate: " + (int)comRate + "%");
            System.out.println("Commission Earned: $" + comEarned);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + tpay);
        }
        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + tsales);
        System.out.println("Total Commissions: $" + tcom);
        System.out.println("Top Performer: " + topPerf);
    }
}