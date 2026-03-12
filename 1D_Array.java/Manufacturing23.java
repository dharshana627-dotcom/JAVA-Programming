import java.util.*;
public class Manufacturing23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],total=0,index1=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index1=i+1;
            }
        }
        double avg=(double)total/n;
        double threshold=avg*0.9;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("Production Lines: "+n);
        System.out.println("Total Output: "+total+" units");
        System.out.printf("Average Output: %.2f units/hour\n",avg);
        System.out.println("Top Producer: Line "+index1+" ("+max+"units)");
        System.out.println("Underperforming Lines: "+count);
        System.out.printf("Performance Threshold: %.2f units\n",threshold);
        System.out.print("Priority Lines: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}