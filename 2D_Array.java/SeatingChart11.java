import java.util.*;
public class SeatingChart11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Seating Layout:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int vio = 0;
        String res = "";
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (arr[i][j]==1) {
                    if (j+1<c && arr[i][j+1]==1) {
                        vio++;
                        res+="- Seat at (" + i + ", " + j + ") is too close to (" + i + ", " + (j + 1) + ")\n";
                    }
                    if (i+1<r && arr[i+1][j]==1) {
                        vio++;
                        res += "- Seat at (" + i + ", " + j + ") is too close to (" + (i + 1) + ", " + j + ")\n";
                    }
                }
            }
        }

        System.out.println("\nViolations Found: "+vio);
        if (vio>0) {
            System.out.println("Violation Coordinates:");
            System.out.print(res);
            System.out.println("Status: Non-Compliant");
        } else {
            System.out.println("Status: Compliant");
        }
    }
}