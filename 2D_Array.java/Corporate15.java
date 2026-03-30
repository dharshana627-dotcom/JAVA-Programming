import java.util.*;
public class Corporate15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dept=sc.nextInt();
        int arr[][]=new int[dept][];
        int total=0;
        for (int i=0;i<dept;i++) {
            int n=sc.nextInt();
            arr[i]=new int[n];
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
                total++;
            }
        }
        System.out.println("Employee Contact Book:");
        for (int i=0;i<dept;i++) {
            System.out.print("Dept "+(i+1)+": ");
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Employees: "+total);
    }
}