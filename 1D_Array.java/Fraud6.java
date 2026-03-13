import java.util.*;
public class Fraud6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        double fraud=avg*2;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>fraud){
                index[count]=i;
                count++;
            }
        } 
        System.out.println("Total Transactions: "+n);
        System.out.printf("Average Transactions: $%.2f",avg);
        System.out.println("\nSuspicious Transactions: "+count);
        System.out.print("Fraud Alert Indices: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}