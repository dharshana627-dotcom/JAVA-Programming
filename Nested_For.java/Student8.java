import java.util.*;
public class Student8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int days = sc.nextInt();
        int perfect = 0;
        System.out.println("Attendance Matrix:");
        System.out.print("Student ");
        for (int i = 1; i <= days; i++) {
            System.out.print("Day" + i + " ");
        }
        System.out.println("Attendance%");
        for (int i = 0; i < students; i++) {
            String name = sc.next();
            int present = 0;
            System.out.print(name + " ");
            for (int j = 0; j < days; j++) {
                String status = sc.next();
                System.out.print(status + " ");
                if (status.equals("P")) {
                    present++;
                }
            }
            if (present == days) {
                perfect++;
            }
            double per = (present * 100.0) / days;
            System.out.printf("%.2f%%\n", per);
        }
        System.out.println();
        System.out.println("Perfect Attendance: " + perfect + " students");
    }
}