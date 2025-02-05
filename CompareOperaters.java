import java.util.Scanner;
public class CompareOperaters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        CompareNo(a,b);
    }
    public static void CompareNo(int a, int b){
            System.out.println(a+" < "+b+ " is " +(a<b));
            System.out.println(a+" <= "+b+ " is " +(a<=b));
            System.out.println(a+" > "+b+ " is " +(a>b));
            System.out.println(a+" >= "+b+ " is " +(a>=b));
            System.out.println(a+" == "+b+ " is " +(a==b));
            System.out.println(a+" != "+b+ " is " +(a!=b));
    }  
}
