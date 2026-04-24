import java.util.*;
public class Engine14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyword = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Highlighted Text:");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            String lowerLine = line.toLowerCase();
            String lowerKey = keyword.toLowerCase();
            String result = "";
            int index = 0;
            while (index < line.length()) {
                int found = lowerLine.indexOf(lowerKey, index);
                if (found == -1) {
                    result += line.substring(index);
                    break;
                }
                result += line.substring(index, found);
                result += "<b>" + line.substring(found, found + keyword.length()) + "</b>";
                index = found + keyword.length();
            }
            System.out.println(i + ". " + result);
        }
    }
}
