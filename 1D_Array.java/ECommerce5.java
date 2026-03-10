import java.util.*;
public class ECommerce5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double high=arr[0],low=arr[0],diff=0;
        for(int i=0;i<n;i++){
            if(arr[i]<low){
                low=arr[i];
            }
            if(arr[i]>high){
                high=arr[i];
            }
        }
        diff=high-low;
        double sav=(diff*100.0)/high;

        System.out.println("Number of Sellers: "+n);
        System.out.printf("Lowest Price: $%.2f",low);
        System.out.printf("\nHighest Price: $%.2f",high);
        System.out.printf("\nPrice Difference: $%.2f",diff);
        System.out.printf("\nSavings: %.2f%%",sav);
    }
}