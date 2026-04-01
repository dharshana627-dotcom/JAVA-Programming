import java.util.*;
public class Hotel18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i=0;i<n;i++) {
            int rooms = sc.nextInt();
            arr[i] = new int[rooms];
            for (int j=0;j<rooms;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Hotel Status:");
        for (int i=0;i<n;i++) {
            System.out.print("Floor "+(i+1)+": ");
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nOccupancy Report:");
        int max = 0;
        int maxFloor = 0;
        for (int i=0;i<n;i++){
            int count = 0;
            for (int j=0;j<arr[i].length;j++) {
                if (arr[i][j]==1) {
                    count++;
                }
            }
            System.out.println("Floor "+(i+1)+": "+count+" occupied");
            if (count>max) {
                max = count;
                maxFloor = i;
            }
        }
        System.out.println("\nBusiest Floor: Floor "+(maxFloor+1)+" ("+max+" rooms occupied)");
    }
}