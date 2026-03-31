import java.util.*;
public class Treasure16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int arr[][] = new int[rows][];
        for (int i=0;i<rows;i++) {
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for (int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Treasure Map:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if (r<rows && c<arr[r].length && arr[r][c] == 1) {
            System.out.println("\nChecking Location ("+r+", "+c+"): Treasure Found");
        } else {
            System.out.println("\nChecking Location ("+r+", "+c+"): No Treasure");
            if (r<rows && c<arr[r].length) {
                arr[r][c] = 1;
            }
        }
        System.out.println("\nFinal Map:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}