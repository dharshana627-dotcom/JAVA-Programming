import java.util.*;
public class Password2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Password Analysis:");
        for (int i=1;i<=n;i++) {
            String pwd = sc.nextLine();
            boolean upper = false;
            boolean lower = false;
            boolean digit = false;
            boolean special = false;
            for (int j=0;j<pwd.length();j++) {
                char ch=pwd.charAt(j);
                if (Character.isUpperCase(ch)) upper = true;
                else if (Character.isLowerCase(ch)) lower = true;
                else if (Character.isDigit(ch)) digit = true;
                else special = true;
            }
            String res="";
            if (pwd.length()<8) res+="Length<8, ";
            if (!upper) res+="Missing upper, ";
            if (!lower) res+="Missing lower, ";
            if (!digit) res+="Missing digit, ";
            if (!special) res+="Missing special, ";
            if (res.equals("")) {
                System.out.println(i+". "+pwd+" - Strong");
            } else {
                res=res.substring(0,res.length()-2);
                System.out.println(i+". "+pwd+" - Weak ("+res+")");
            }
        }
    }
}