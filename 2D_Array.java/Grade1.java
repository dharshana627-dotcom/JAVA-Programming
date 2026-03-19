import java.util.*;
public class Grade1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Student Averages:");
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            double avg=(sum*100.0)/c;
            System.out.printf("Student %d: %.0f\n",(i+1),avg);

        }
        System.out.println();
        System.out.println("Subject Averages:");
        for(int j=0;j<c;j++){
            int sum=0;
            for(int i=0;i<r;i++){
                sum+=arr[i][j];
            }
            double avg=(sum*100.0)/r;
            System.out.printf("Subject %d: %.0f\n",(j+1),avg);
        }
    }
}