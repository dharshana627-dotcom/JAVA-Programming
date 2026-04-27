import java.util.*;
public class Valid17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Syntax Check:");
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                isValid = false;
            }
            if (isValid) {
                System.out.println(i + ". " + str + " -> Valid");
            } else {
                System.out.println(i + ". " + str + " -> Invalid");
            }
        }
    }
}