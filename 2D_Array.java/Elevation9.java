import java.util.*;
public class Elevation9 {
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
        System.out.println("Elevation Map:");
        int max = arr[0][0],min = arr[0][0];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
                if (arr[i][j]>max) {
                    max=arr[i][j];
                }
                if (arr[i][j]<min) {
                    min = arr[i][j];
                }
            }
            System.out.println();
        }
        int range=max-min;
        System.out.println("\nHighest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        System.out.println("Elevation Range: "+range+" m");
    }
}