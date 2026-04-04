import java.util.*;
public class Sudoku17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sudoku Grid:");
        for (int i=0;i<9;i++) {
            if (i%3==0 && i!=0)
                System.out.println("---------------------");
            for (int j=0;j<9;j++) {
                if (j%3==0 && j!=0)
                    System.out.print("| ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean valid = true;
        for (int i = 0; i < 9; i++) {
            boolean seen[] = new boolean[10];
            for (int j=0;j<9;j++) {
                int num = arr[i][j];
                if (seen[num]) {
                    valid = false;
                    break;
                }
                seen[num] = true;
            }
        }
        for (int j=0;j<9;j++) {
            boolean seen[] = new boolean[10];
            for (int i=0;i<9;i++) {
                int num = arr[i][j];
                if (seen[num]) {
                    valid = false;
                    break;
                }
                seen[num] = true;
            }
        }
        for (int boxRow=0;boxRow<9;boxRow+=3) {
            for (int boxCol=0;boxCol<9;boxCol+=3) {
                boolean seen[] = new boolean[10];
                for (int i=0;i<3;i++) {
                    for (int j=0;j<3;j++) {
                        int num = arr[boxRow+i][boxCol+j];
                        if (seen[num]) {
                            valid = false;
                        }
                        seen[num] = true;
                    }
                }
            }
        }
        if (valid)
            System.out.println("\nStatus: Valid Solution");
        else
            System.out.println("\nStatus: Invalid Solution");
    }
}