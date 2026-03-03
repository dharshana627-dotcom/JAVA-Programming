import java.util.Scanner;
public class Hotel5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double tocRate = 0.0;
        int peakDay = 0;
        double high = 0.0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int rooms = sc.nextInt();
            int trooms = sc.nextInt();
            sc.nextLine();

            double ocRate=(rooms/trooms)*100;
            tocRate+=ocRate;
            String status="";
            if(ocRate<60){
                status="Low";
            }else if(ocRate>=60 && ocRate<=79){
                status="Moderate";
            }else if(ocRate>=80 && ocRate<=99){
                status="High";
            }else if(ocRate==100){
                status="Full";
                capacity++;
            }
            if(ocRate>high){
                high=ocRate;
                peakDay=day;
            }

            System.out.println("Day: "+day);
            System.out.println("Rooms Occupied: "+rooms);
            System.out.println("Total Rooms: "+trooms);
            System.out.println("Occupancy Rate: "+ocRate+"%");
            System.out.println("Status: "+status);

            
        }
        double avg=tocRate/n;
        System.out.println("\nTotal Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+avg+"%");
        System.out.println("Peak Occupancy Day: Day "+peakDay);
        System.out.println("Days at Full Capacity: "+capacity);
    }
}