import java.util.*;
public class Warehouse18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],total=0,place=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                place=i+1;
            }
        }
        double avg=(double)total/n;
        double threshold=avg*0.5;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("Total Products: "+n);
        System.out.println("Total Units Sold:"+total);
        System.out.printf("Average Monthly Sales: %.2f\n",avg);
        System.out.println("Best Seller: Product "+place+" ("+max+" units)");
        System.out.println("Slow-Moving Products: "+count);
        System.out.printf("Turnover Threshold: %.2f units\n",threshold);
        System.out.print("Clearance Candidates: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}