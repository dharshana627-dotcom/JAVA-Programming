import java.util.*;
public class Game14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int rot[][] = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                rot[j][n-1-i]=arr[i][j];
            }
        }
        System.out.println("\nRotated Matrix (90 deg clockwise):");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(rot[i][j]+" ");
            }
            System.out.println();
        }
    }
}