import java.util.*;
public class Island25 {
    static void dfs(int[][] arr, int i, int j, int r, int c) {
        if (i < 0 || j < 0 || i >= r || j >= c || arr[i][j] == 0)
            return;
        arr[i][j] = 0;
        dfs(arr, i + 1, j, r, c);
        dfs(arr, i - 1, j, r, c);
        dfs(arr, i, j + 1, r, c);
        dfs(arr, i, j - 1, r, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Map:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    dfs(arr, i, j, r, c);
                }
            }
        }
        System.out.println("\nNumber of Islands: " + count);
    }
}