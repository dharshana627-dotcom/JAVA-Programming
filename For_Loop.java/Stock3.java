import java.util.Scanner;
public class Stock3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int lowCount = 0;
        int critCount = 0;
        double quantity=0;
        double total=0.0;

        for (int i = 1; i <= n; i++) {
            String proName = sc.next();
            int cstock = sc.nextInt();
            int minstock = sc.nextInt();
            sc.nextLine();

            String status="";
            if(cstock>=minstock){
                status="Adequate";
                quantity=0;
            }else if((cstock<minstock)&&(cstock>=minstock/2)){
                status="Low Stock";
                lowCount++;
                quantity=(minstock-cstock)+minstock/2;
            }else if(cstock<minstock/2){
                status="Critical";
                critCount++;
                quantity=(minstock-cstock)+minstock*1.5;
            }
            total += quantity;

            System.out.println("Product: "+proName);
            System.out.println("Current Stock: "+cstock);
            System.out.println("Minimum Stock: "+minstock);
            System.out.println("Status: "+status);
            System.out.printf("Reorder Quantity: %.2f\n",quantity);
        }
        System.out.println("Total Products: "+n);
        System.out.println("Low Stock Items: "+lowCount);
        System.out.println("Critical Items: "+critCount);
        System.out.println("Total Reorder Quantity: "+total);

    }
}

