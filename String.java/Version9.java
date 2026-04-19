import java.util.*;
public class Version9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Version Comparison:");
        for (int i = 1; i <= n; i++) {
            String v1 = sc.next();
            String v2 = sc.next();
            String a[] = v1.split("\\.");
            String b[] = v2.split("\\.");
            int len = Math.max(a.length, b.length);
            int result = 0;
            for (int j = 0; j < len; j++) {
                int num1 = (j < a.length) ? Integer.parseInt(a[j]) : 0;
                int num2 = (j < b.length) ? Integer.parseInt(b[j]) : 0;
                if (num1 > num2) {
                    result = 1;
                    break;
                } else if (num1 < num2) {
                    result = -1;
                    break;
                }
            }
            if (result == 0) {
                System.out.println(i + ". " + v1 + " vs " + v2 + " -> Equal");
            } else if (result == 1) {
                System.out.println(i + ". " + v1 + " vs " + v2 + " -> v1 is Newer");
            } else {
                System.out.println(i + ". " + v1 + " vs " + v2 + " -> v2 is Newer");
            }
        }
    }
}