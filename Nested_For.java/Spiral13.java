import java.util.*;
public class Spiral13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1,num = 1;
        while (num<=n*n) {
            for (int i=left;i<=right;i++) {
                arr[top][i]=num++;
            }
            top++;
            for (int i=top;i<=bottom;i++) {
                arr[i][right]=num++;
            }
            right--;
            for (int i=right;i>=left;i--) {
                arr[bottom][i]=num++;
            }
            bottom--;
            for (int i=bottom;i>=top;i--) {
                arr[i][left]=num++;
            }
            left++;
        }
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}