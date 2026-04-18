import java.util.*;
public class Anagram8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Anagram Check:");
        for (int i = 1; i <= n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            char a[] = s1.toCharArray();
            char b[] = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println(i + ". " + s1 + " & " + s2 + " -> Anagram");
            } else {
                System.out.println(i + ". " + s1 + " & " + s2 + " -> Not Anagram");
            }
        }
    }
}