import java.util.*;
public class Message3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String compressed="";
        int count=1;
        for (int i=0;i<str.length();i++) {
            if (i<str.length()-1 && str.charAt(i)==str.charAt(i + 1)) {
                count++;
            } else {
                compressed+=str.charAt(i)+String.valueOf(count);
                count = 1;
            }
        }
        double ratio=(compressed.length()*100.0)/str.length();
        System.out.println("Original: "+str);
        System.out.println("Compressed: "+compressed);
        System.out.printf("Compression Ratio: %.2f%%",100-ratio);
    }
}