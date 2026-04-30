import java.util.*;
public class CamelCase20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += "_" + Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println("CamelCase: " + input);
        System.out.println("SnakeCase: " + result);
    }
}
