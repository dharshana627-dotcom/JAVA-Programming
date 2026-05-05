import java.util.*;
public class DNA25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String text = sc.nextLine();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.substring(i, i + pattern.length()).equals(pattern)) {
                indices.add(i);
            }
        }
        System.out.print("Occurrences: " + indices.size() + " (indices ");
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i));
            if (i < indices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" if counting overlapping \"start positions\")");
    }
}