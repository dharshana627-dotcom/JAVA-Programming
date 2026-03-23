import java.util.*;
public class Cinema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char arr[][] = new char[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                arr[i][j]='A';
            }
        }
        int booked = sc.nextInt();
        for (int i=0;i<booked;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y]='B';
        }
        System.out.println("Seating Chart:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int total = r*c;
        int available = total-booked;
        double rate = (booked*100.0)/total;
        
        System.out.println("\nTotal Seats: " + total);
        System.out.println("Booked Seats: " + booked);
        System.out.println("Available Seats: " + available);
        System.out.printf("Occupancy Rate: %.2f%%", rate);
    }
}