import java.util.*;
public class Classroom13 {
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
        System.out.println("Seating Map:");
        int occupied = 0;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
                if (arr[i][j]==1) {
                    occupied++;
                }
            }
            System.out.println();
        }
        int total = r*c;
        int rate = (int)((occupied*10000.0)/total);
        System.out.println("\nTotal Occupied: "+occupied);
        System.out.printf("Occupancy Rate: %d%%\n",rate);
        System.out.print("Empty Rows: [");
        boolean first = true;
        for (int i=0;i<r;i++) {
            boolean empty=true;
            for (int j=0;j<c;j++) {
                if (arr[i][j]==1) {
                    empty=false;
                    break;
                }
            }
            if (empty) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first=false;
            }
        }
        System.out.println("]");
    }
}