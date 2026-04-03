import java.util.*;
public class Symmetric20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean symmetric = true;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (arr[i][j]!=arr[j][i]) {
                    symmetric=false;
                    break;
                }
            }
            if (!symmetric) break;
        }
        if (symmetric)
            System.out.println("\nStatus: Symmetric");
        else
            System.out.println("\nStatus: Asymmetric");
    }
}