import java.util.*;
public class Caesar18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // shift and wrap
                char enc = (char) ((ch - 'A' + 3) % 26 + 'A');
                result += enc;
            }
            else if (ch >= 'a' && ch <= 'z') {
                char enc = (char) ((ch - 'a' + 3) % 26 + 'a');
                result += enc;
            }
            else {
                result += ch;
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Encrypted: " + result);
    }
}
