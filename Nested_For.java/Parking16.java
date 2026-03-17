import java.util.*;
public class Parking16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char grid[][] = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = ' ';
            }
        }
        int occupied = sc.nextInt();
        for (int i = 0; i < occupied; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x][y] = 'O';
        }
        System.out.println("Parking Lot Grid:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 'O') {
                    System.out.print("[O] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        int total=r*c;
        int vacant=total-occupied;
        double rate=(occupied*100.0)/total;
        System.out.println("\nTotal Spots: "+total);
        System.out.println("Occupied: "+occupied);
        System.out.println("Vacant: "+vacant);
        System.out.printf("Occupancy Rate: %.2f%%",rate);
    }
}