import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of 100 Rupees Notes: ");
        int note100 = sc.nextInt();
        System.out.println("Enter the No. of 500 Rupees Notes: ");
        int note500 = sc.nextInt();
        System.out.println("Enter the No. of 1000 Rupees Notes: ");
        int note1000 = sc.nextInt();
        int totalAmount = (note100*100)+(note500*500)+(note1000*1000);
        System.out.println("Total Amount Withdrawn: "+totalAmount);
        
    }    
}
