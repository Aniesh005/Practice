import java.util.Scanner;
public class unitDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int unitDigit = num%10;
        System.out.println(unitDigit);
    }    
}
