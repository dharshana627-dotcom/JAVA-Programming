import java.util.*;
public class Rainfall12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 4, c = 7;
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rainfall Data:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.printf("%02d ",arr[i][j]*10);
            }
            System.out.println();
        }
        System.out.println("\nWeekly Totals:");
        int total=0,min=arr[0][0],minIndex=0;
        for (int i=0;i<r;i++) {
            int sum=0;
            for (int j=0;j<c;j++) {
                sum+=arr[i][j]*10;
            }
            System.out.printf("Week %d: %02d mm\n", (i + 1), sum);
            total+=sum;
            if (sum<min) {
                min=sum;
                minIndex=i;
            }
        }
        System.out.println("\nMonthly Total: "+total+" mm");
        System.out.printf("Driest Week: Week %d (%02d mm)",(minIndex+1),min);
    }
}