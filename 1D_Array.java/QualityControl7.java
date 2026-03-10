import java.util.*;
public class QualityControl7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[]=new int[n1];
        int index[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,total=0;
        for(int i=0;i<n1;i++){
            if(arr[i]>n2){
                index[count]=i+1;
                count++;
            }
        }
        total=n1-count;
        double per=(total*100.0)/n1;
        System.out.println("Production Lines: "+n1);
        System.out.println("Acceptable Threshold: "+n2);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.printf("Compliance Rate: %.2f%%",per);
    }
}