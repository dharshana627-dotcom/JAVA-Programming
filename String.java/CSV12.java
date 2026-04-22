import java.util.*;
public class CSV12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Parsed Fields:");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            List<String> fields = new ArrayList<>();
            String current = "";
            boolean inQuotes = false;
            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if (ch == '"') {
                    inQuotes = !inQuotes;
                    current += ch;
                }
                else if (ch == ',' && !inQuotes) {
                    fields.add(current.trim());
                    current = "";
                }
                else {
                    current += ch;
                }
            }
            fields.add(current.trim());
            System.out.print(i + ". [");
            for (int k = 0; k < fields.size(); k++) {
                System.out.print(fields.get(k));
                if (k < fields.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
