import java.util.*;
public class Smart12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextDouble();
        }
        double limit=sc.nextDouble();
        double max=arr[0],total=0;
        int index=0;

        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index = i+1;
            }
        }
        double avg=total/n;
        double diff=total-limit;
        System.out.println("Hours Monitored: "+n);
        System.out.printf("Total Daily Consumption: %.2f kWh",total);
        System.out.printf("\nPeak Hour: Hour %d (%.2f kWh)",index,max);
        System.out.printf("\nAverage Hourly: %.2f kWh",avg);
        System.out.printf("\nDaily Limit: %.2f kWh",limit);
        if(total<=limit){
            System.out.println("\nStatus: Within Limit");
        }else{
            System.out.printf("\nStatus: Exceeded by %.2f kWh",diff);
        }
    }
}