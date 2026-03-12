import java.util.*;
public class Cybersecurity25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0],total=0;
        int index1=0;
        int index2=0;
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
        double threshold=avg*2.0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("Security Events Analyzed: "+n);
        System.out.printf("Average Risk Score: %.2f\n",avg);
        System.out.println("Highest Risk Event: "+max+" (Event "+index1+")");
        System.out.println("Lowest Risk Event: "+min+" (Event "+index2+")");
        System.out.println("Critical Threats (>200% avg): "+count);
        System.out.printf("Threat Threshold: %.2f\n",threshold);
        System.out.print("Alert Events: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}