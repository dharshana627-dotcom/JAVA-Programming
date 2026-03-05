import java.util.Scanner;
public class Gym17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        sc.nextLine();
        double totalRevenue = 0;
        int urgentCount = 0;

        for(int i=0;i<n;i++){
            String name = sc.next();
            String type = sc.next();
            int expiry = sc.nextInt();
            sc.nextLine();

            double fee = 0;
            switch(type){
                case "Basic": 
                    fee = 50;
                    break;
                case "Premium": 
                    fee = 100;
                    break;
                case "VIP":
                    fee = 200;
                    break;
            }
            int dis = 0;
            if(expiry >= 45){
                dis = 20;
            }else if(expiry >= 30 && expiry <= 44){
                dis = 15;
            }else if(expiry >= 15 && expiry <=29){
                dis = 10;
            }else if(expiry < 15){
                dis = 0;
            }
            String prio="";
            if(expiry < 10){
                prio = "Urgent";
                urgentCount++;
            }else if(expiry >= 10 && expiry <= 30){
                prio = "High";
            }else if(expiry > 30){
                prio = "Normal";
            }
            double finalFee = fee * (1-dis/100);
            totalRevenue += finalFee;

            System.out.println("Member: "+name);
            System.out.println("Membership: "+type);
            System.out.println("Days Until Expiry: "+expiry);
            System.out.println("Renewal Fee: $"+fee);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Final Fee: $"+finalFee);
            System.out.println("Priority: "+prio);
            System.out.println("\n");
        }
        double avg=(n>0)?totalRevenue/n:0;
        System.out.println("Total Members: "+n);
        System.out.println("urgent Renewals: "+urgentCount);
        System.out.println("Total Renewal Revenue: $"+totalRevenue);
        System.out.println("Average Renewal Fee: $"+avg);
    }
}