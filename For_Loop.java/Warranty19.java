import java.util.Scanner;
public class Warranty19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int expired=0,soon=0,active=0;

        for(int i=0;i<n;i++){
            String proid = sc.next();
            String protype = sc.next();
            int purchase = sc.nextInt();

            int mon=0,rem=0;
            switch(protype){
                case "Electronics":
                    mon=12;
                    break;
                case "Appliance":
                    mon=24;
                    break;
                case "Computer":
                    mon=36;
                    break;
            }
            rem=mon-purchase;
            if(rem<0){
                rem=0;
            }
            sc.nextLine();
            String status="";
            if(rem==0){
                status="Expired";
                expired++;
            }else if(rem>=1 && rem<=3){
                status="Expiring Soon";
                soon++;
            }else if(rem>3){
                status="Active";
                active++;
            }

            System.out.println("Product ID: "+proid);
            System.out.println("Type: "+protype);
            System.out.println("Warranty Period: "+mon+" months");
            System.out.println("Months Used: "+purchase);
            System.out.println("Remaining: "+rem+" months");
            System.out.println("Status: "+status);
            System.out.println("\n");
        }
        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties: "+active);
        System.out.println("Expiring Soon: "+soon);
        System.out.println("Expired Warranties: "+expired);

    }
}