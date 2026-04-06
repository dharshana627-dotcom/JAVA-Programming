import java.util.*;
public class Magic23{
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
        int sum = 0;
        for (int j=0;j<n;j++) {
            sum+=arr[0][j];
        }
        boolean isMagic = true;
        for (int i=0;i<n;i++) {
            int sum1=0;
            for (int j=0;j<n;j++) {
                sum1+=arr[i][j];
            }
            if (sum1!=sum) {
                isMagic = false;
                break;
            }
        }
        for (int j=0;j<n && isMagic;j++) {
            int sum2= 0;
            for (int i=0;i<n;i++) {
                sum2+=arr[i][j];
            }
            if (sum2!=sum) {
                isMagic = false;
                break;
            }
        }
        int d1=0;
        for (int i=0;i<n;i++) {
            d1+=arr[i][i];
        }
        int d2=0;
        for (int i=0;i<n;i++) {
            d2+=arr[i][n-1-i];
        }
        if (d1!=sum || d2!=sum) {
            isMagic = false;
        }
        if (isMagic) {
            System.out.println("\nResult: Magic Square");
            System.out.println("(Constant: "+sum+")");
        } else {
            System.out.println("\nResult: Not a Magic Square");
        }
    }
}