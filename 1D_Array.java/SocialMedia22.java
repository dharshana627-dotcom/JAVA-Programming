import java.util.*;
public class SocialMedia22{
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
        double threshold=avg*2.0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("Total Posts: "+n);
        System.out.printf("Average Engagement: %.2f%%\n",avg);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n",max,index1);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n",min,index2);
        System.out.println("Viral Posts (>200% avg): "+count);
        System.out.printf("Viral Threshold: %.2f%%\n",threshold);
        System.out.print("Top Performers: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}