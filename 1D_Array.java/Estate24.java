import java.util.*;
public class Estate24{
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
        double bargain=avg*0.7;
        double premium=avg*1.5;
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<bargain){
                index[count1]=i+1;
                count1++;
            }
            if(arr[i]>premium){
                index[count2]=i+1;
                count2++;
            }
        }
        System.out.println("Total Properties: "+n);
        System.out.printf("Portfolio Value: $%.2f\n",total);
        System.out.printf("Average Property Value: $%.2f\n",avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n",max,index1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n",min,index2);
        System.out.println("Bargain Properties (<70% avg): "+count1);
        System.out.println("Premium Properties (>150% avg): "+count2);
    }
}