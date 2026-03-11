import java.util.*;
public class StockMarket16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0],total=0;
        int count=0,place=1;

        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                place=i+1;
            }
        }
        int avg=total/n;
        double per=avg*1.5;
        System.out.println("Trading Days Analyzed: "+n);
        System.out.println("Total Volume: "+total);
        System.out.println("Average Daily Volume: "+avg);
        System.out.println("Peak Volume Day: Day "+place+" ("+max+")");
        System.out.println("High Volume Days (>150% avg): "+count);
        System.out.print("Breakout Signal Days: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}