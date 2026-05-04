import java.util.*;
public class JSON24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String json = sc.nextLine();
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        String value = "";
        if (keyIndex != -1) {
            int colonIndex = json.indexOf(":", keyIndex);
            int startQuote = json.indexOf("\"", colonIndex + 1);
            int endQuote = json.indexOf("\"", startQuote + 1);
            value = json.substring(startQuote + 1, endQuote);
        }
        System.out.println("Extracted Value: " + value);
    }
}
