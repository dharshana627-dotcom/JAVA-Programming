import java.util.*;
public class Temperature4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],min=arr[0],total=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            total+=arr[i];
        }
        double range=max-min;
        double avg=total/n;

        System.out.println("Number of Readings: "+n);
        System.out.printf("Maximum Temperature: %.2f",max);
        System.out.printf("\nMinimum Temperature: %.2f",min);
        System.out.printf("\nTemperature Range: %.2f",range);
        System.out.printf("\nAverage Temperature: %.2f",avg);
    }
}