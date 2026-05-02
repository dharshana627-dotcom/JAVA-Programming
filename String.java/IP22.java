import java.util.*;
public class IP22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("IP Validation:");
        for (int i = 1; i <= n; i++) {
            String ip = sc.nextLine();
            String parts[] = ip.split("\\.");
            boolean isValid = true;
            if (parts.length != 4) {
                isValid = false;
            } else {
                for (String part : parts) {
                    if (part.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    try {
                        int num = Integer.parseInt(part);

                        if (num < 0 || num > 255) {
                            isValid = false;
                            break;
                        }
                    } catch (Exception e) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(i + ". " + ip + " -> Valid");
            } else {
                System.out.println(i + ". " + ip + " -> Invalid");
            }
        }
    }
}
