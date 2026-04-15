import java.util.*;
public class URL5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("URL Analysis:");
        for (int i=1;i<=n;i++) {
            String url = sc.nextLine();
            String temp = url;
            if (temp.startsWith("http://")) {
                temp = temp.substring(7);
            } else if (temp.startsWith("https://")) {
                temp = temp.substring(8);
            }
            if (temp.startsWith("www.")) {
                temp = temp.substring(4);
            }
            int slashIndex = temp.indexOf('/');
            String domain;
            if (slashIndex!=-1) {
                domain = temp.substring(0,slashIndex);
            } else {
                domain = temp;
            }
            System.out.println(i+". "+url+" -> Domain: "+domain);
        }
    }
}