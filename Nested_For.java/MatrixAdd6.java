import java.util.*;
public class MatrixAdd6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int sum[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix B:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nSum (A + B):");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=A[i][j]+B[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}