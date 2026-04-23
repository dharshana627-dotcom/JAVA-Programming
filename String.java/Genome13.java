import java.util.*;
public class Genome13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("RNA Transcription:");
        for (int i = 1; i <= n; i++) {
            String dna = sc.nextLine();
            String rna = dna.replace('T', 'U');
            System.out.println(i + ". " + dna + " -> " + rna);
        }
    }
}
