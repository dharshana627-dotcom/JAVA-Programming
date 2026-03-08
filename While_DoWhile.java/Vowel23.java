import java.util.Scanner;
public class Vowel23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Text: "+str);
        int i=0,count=0;
        do{
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
            i++;
        }while(i<str.length());
        System.out.println("Vowel count: "+count);
    }
}