import java.util.Scanner;
public class SumofRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int M = sc.nextInt();
        System.out.println("Enter the second number: ");
        int N = sc.nextInt();
        int sum =0;
        for(int i=M; i <=N; i++){
            sum = sum + i;
        }
        System.out.println(sum);
     }
}