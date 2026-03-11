import java.util.*;
public class CallCenter15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextDouble();
        }
        double max=arr[0],min=arr[0],sum=0;
        int count=0;

        for (int i=0;i<n;i++) {
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        }
        double avg=sum/n;
        double per=((n-count)/n)*100.0;
        System.out.println("Total Calls: "+n);
        System.out.printf("Average Handling Time: %.2f seconds\n",avg);
        System.out.println("Shortest Call: "+min+" seconds");
        System.out.println("Longest Call: "+max+" seconds");
        System.out.println("Calls Exceeding Target (300s): "+count);
        System.out.printf("Target Compliance: %.2f%%",per);
    }
}