import java.util.*;
public class Vehicle21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],min=arr[0],total=0;
        int index1=0,index2=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index1=i+1;
            }
            if (arr[i]<min) {
                min = arr[i];
                index2=i+1;
            }
        }
        double avg=(double)total/n;
        double threshold=avg*0.8;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("Fleet Size: "+n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n",avg);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n",max,index1);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n",min,index2);
        System.out.println("Underperforming Vehicles: "+count);
        System.out.printf("Efficiency Threshold: %.2f MPG\n",threshold);
        System.out.print("Maintenance Priority: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}