import java.util.*;
public class Log16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> criticalLogs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String log = sc.nextLine();
            if (log.contains("ERROR") || log.contains("EXCEPTION")) {
                criticalLogs.add(log);
            }
        }
        System.out.println("Critical Logs:");
        for (int i = 0; i < criticalLogs.size(); i++) {
            System.out.println((i + 1) + ". " + criticalLogs.get(i));
        }
        System.out.println("Total Errors Found: " + criticalLogs.size());
    }
}
