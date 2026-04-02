import java.util.*;
public class Image19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Image:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nCompressed Image:");
        for (int i=0;i<n;i+=2) {
            for (int j=0;j<n;j+=2) {
                int sum=arr[i][j]+arr[i][j+1]+arr[i+1][j] + arr[i+1][j+1];
                int avg=sum/4;
                System.out.print(avg+" ");
            }
            System.out.println();
        }
    }
}