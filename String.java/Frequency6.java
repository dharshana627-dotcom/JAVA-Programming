import java.util.*;
public class Frequency6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        input = input.replaceAll("[^a-z ]", "");
        String words[] = input.split("\\s+");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequency Report:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("Total Unique Words: " + map.size());
    }
}