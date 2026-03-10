import java.util.*;
public class Network10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fast=arr[0],slow=arr[0];
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<fast){
                fast=arr[i];
            }
            if(arr[i]>slow){
                slow=arr[i];
            }
            if(arr[i]>200){
                count++;
            }
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        double per=((double)(n-count)*100)/n;
        System.out.println("Total Servers: "+n);
        System.out.println("Fastest Response: "+fast+"ms");
        System.out.println("Slowest Response: "+slow+"ms");
        System.out.printf("Average Response: %.2f",avg);
        System.out.println("\nSlow Servers (>200ms): "+count);
        System.out.printf("Performance Score: %.2f%%",per);
    }
}