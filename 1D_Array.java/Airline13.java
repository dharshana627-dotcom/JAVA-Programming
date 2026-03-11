import java.util.*;
public class Airline13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],sum=0;
        int count1=0,count2=0;

        for (int i=0;i<n;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<=15){
                count1++;
            }
            if(arr[i]>180){
                count2++;
            }
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        double per=(count1/n)*100.0;
        System.out.println("Hours Monitored: "+n);
        System.out.printf("Average Delay: %.2f minutes\n",avg);
        System.out.printf("Maximum Delay: "+max+" minutes\n");
        System.out.println("On-Time Flights: "+count1);
        System.out.println("Compensation Required: "+count2);
        System.out.printf("On-Time Performance: %.2f%%",per);
    }
}