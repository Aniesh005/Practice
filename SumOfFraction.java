import java.util.Scanner;

public class SumOfFraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1+num2;
        int integerpart =(int)sum;
        float fraction = (sum - integerpart);
        System.out.println("Fractional Part:\n" +fraction); 

    }
    
}
