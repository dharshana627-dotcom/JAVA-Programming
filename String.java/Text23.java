import java.util.*;
public class Text23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        sc.nextLine(); 
        String text = sc.nextLine();
        System.out.println("Formatted Text:");
        String words[] = text.split(" ");
        String line = "";
        for (String word : words) {
            while (word.length() > width) {
                System.out.println(word.substring(0, width));
                word = word.substring(width);
            }
            if (line.length() == 0) {
                line = word;
            } else if (line.length() + 1 + word.length() <= width) {
                line += " " + word;
            } else {
                System.out.println(line);
                line = word;
            }
        }
        if (!line.isEmpty()) {
            System.out.println(line);
        }
    }
}
