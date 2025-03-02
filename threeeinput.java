import java.util.Scanner;

public class threeeinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input: ");
        int input1 = sc.nextInt();
        System.out.println("Enter the second input: ");
        int input2 = sc.nextInt();
        System.out.println("Enter the third Input: ");
        int input3 = sc.nextInt();
        int result = (input1 + input2)*input3;
        System.out.println("Result: " +result);
    }
    
}
