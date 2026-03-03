import java.util.Scanner;
public class Grade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int totalScore = 0;
        int high = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            sc.nextLine();

            totalScore += score;

            if (score > high) {
                high = score;
            }

            char grade = 'F';
            if (score >= 85 && score <= 100) {
                grade = 'A';
            } else if (score >= 70 && score <= 84) {
                grade = 'B';
            } else if (score >= 60 && score <= 69) {
                grade = 'C';
            } else if (score >= 50 && score <= 59) {
                grade = 'D';
            } else if (score >= 0 && score <= 49) {
                grade = 'F';
            } else {
                System.out.println("Invalid Score!");
            }

            String status;
            if (score >= 60) {
                status = "Pass";
                passCount++;
            } else {
                status = "Fail";
                failCount++;
            }

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = (double) totalScore / n;

        System.out.println("Total Students: " + n);
        System.out.printf("Class Average: %.2f\n", avg);
        System.out.println("Highest Score: " + high);
        System.out.println("Students Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);

        sc.close();
    }
}