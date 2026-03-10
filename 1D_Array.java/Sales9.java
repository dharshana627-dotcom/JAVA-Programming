import java.util.*;
public class Sales9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],min=arr[0],sum=0,count=0;
        int index1=1,index2=1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index1=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                index2=i+1;
            }
            sum+=arr[i];
        }
        double avg=sum/n;
        System.out.println("Total Stores: "+n);
        System.out.println("Highest Sales: $"+max+" (Store "+index1+")");
        System.out.println("Lowest Sales: $"+min+" (Store "+index2+")");
        System.out.println("Total Sales: $"+sum);
        System.out.println("Average Sales: $"+avg);
    }
}