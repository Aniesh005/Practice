import java.util.Scanner;

public class Timecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO. of Days: ");
        int days = sc.nextInt();
        int hours = days*24;
        int minutes = hours*60;
        int seconds = minutes*60;
        System.out.println(days+" Days in Hours: "+hours+" in minutes: "+minutes+" in seconds: "+seconds);
    }
}
