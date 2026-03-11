import java.util.*;
public class Crop14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],sum=0;
        int index=0,count=0;

        for (int i=0;i<n;i++) {
            sum+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index=i+1;
            }
        }
        double avg=sum/n;
        double per=avg*0.8;
        for(int i=0;i<n;i++){
            if(arr[i]<per){
                count++;
            }
        }
        System.out.println("Total Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons\n",sum);
        System.out.printf("Average Yield: %.2f tons/acre\n",avg);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n",max,index);
        System.out.println("Underperforming Plots: "+count);
        System.out.printf("Performance Threshold: %.2f tons/acre",per);
    }
}