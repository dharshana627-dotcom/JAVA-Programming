import java.util.*;
public class Product10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String name[]=new String[r];
        double arr[][]=new double[r][c];
        for(int i=0;i<r;i++){
            name[i]=sc.next();
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Price Comparison Matrix:");
        System.out.print("Product ");
        for (int j=1;j<=c;j++) {
            System.out.print("Vendor"+j+" ");
        }
        System.out.println("BestPrice");
        for (int i=0;i<r;i++) {
            double min=arr[i][0];
            System.out.print(name[i] + " ");
            for (int j=0;j<c;j++) {
                System.out.printf("%.2f ",arr[i][j]);
                if(arr[i][j]<min) {
                    min=arr[i][j];
                }
            }
            System.out.printf("%.2f\n", min);
        }
    }
}