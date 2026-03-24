import java.util.*;
public class Commission10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sales Matrix:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nRepresentative Totals:");
        for (int i=0;i<r;i++) {
            int sum = 0;
            for (int j=0;j<c;j++) {
                sum+=arr[i][j];
            }
            System.out.println("Rep "+(i+1)+": "+sum);
        }
        System.out.println("\nTerritory Totals:");
        for (int j=0;j<c;j++) {
            int sum = 0;
            for (int i=0;i<r;i++) {
                sum+=arr[i][j];
            }
            System.out.println("Territory "+(j+1)+": "+sum);
        }
    }
}