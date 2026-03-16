import java.util.*;
public class Exam14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int total=r*c*2;
        int k=1;
        System.out.println("Exam Seating Plan:");
        for (int i = 0;i<r*2;i++) {
            for (int j=0;j<c;j++) {
                if((i+j)%2==0) {
                    if (k<=n) {
                        System.out.printf("S%03d ",k);
                        k++;
                    } else {
                        System.out.print("---- ");
                    }
                } else {
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }
        System.out.println("\nTotal Seats: " + (r*c));
        System.out.println("Occupied Seats: " + n);
        System.out.println("Empty Seats: " + (r*c-n));
    }
}