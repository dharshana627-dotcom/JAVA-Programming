import java.util.*;
public class WaterQuality17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],min=arr[0],total=0;
        int count=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]<6.5 || arr[i]>8.5){
                index[count]=i+1;
                count++;
            }
        }
        double avg=total/n;
        double per=((double)(n-count)/n)*100.0;
        System.out.println("Total Samples: "+n);
        System.out.printf("Average pH: %.2f\n",avg);
        System.out.printf("Minimum pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.println("Unsafe Samples: "+count);
        System.out.printf("Safety Compliance: %.2f%%\n",per);
        System.out.print("Critical Alerts: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}