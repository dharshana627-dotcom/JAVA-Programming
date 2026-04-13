import java.util.*;
public class Palindrome4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("DNA Sequence Analysis:");
        for (int i=1;i<=n;i++) {
            String str = sc.nextLine();
            String rev = "";
            for (int j=str.length()-1;j>=0;j--) {
                rev+=str.charAt(j);
            }
            if (str.equals(rev)) {
                System.out.println(i+". "+str+" - Palindrome");
            } else {
                System.out.println(i+". "+str+" - Not Palindrome");
            }
        }
    }
}