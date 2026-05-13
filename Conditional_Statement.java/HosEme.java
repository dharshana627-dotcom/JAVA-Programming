import java.util.Scanner;
public class HosEme{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heartRate = sc.nextInt();
        String bp = sc.next();
        double temperature = sc.nextDouble();
        sc.nextLine(); 
        String severity = sc.nextLine();

        String priority = "";
        int waitTime = 0;
        String action = "";

        String parts[] = bp.split("/");
        int systolic = Integer.parseInt(parts[0]);
        int diastolic = Integer.parseInt(parts[1]);

        if (severity.equalsIgnoreCase("Life-Threatening")|| heartRate > 140|| systolic >= 180|| diastolic >= 110|| temperature >= 103) {
            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }else if (severity.equalsIgnoreCase("Severe")|| heartRate > 100 || heartRate < 60|| systolic >= 150|| diastolic >= 95|| temperature >= 101) {
            priority = "Urgent";
            waitTime = 15;
            if (heartRate < 60) {
                waitTime = 20;
            }
            action = "Priority Medical Attention";
        }else if (severity.equalsIgnoreCase("Moderate")) {
            priority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
        }else {
            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}