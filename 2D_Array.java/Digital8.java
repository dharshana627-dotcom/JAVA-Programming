import java.util.*;
public class Digital8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Image:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nAdjusted Image:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                int val=arr[i][j]+n;
                if (val>255) {
                    val=255;
                }
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}