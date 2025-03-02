
import java.util.Scanner;

public class cgst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product price: ");
        double product_price = sc.nextDouble();
        double cgst = product_price*0.09;
        double sgst = product_price*0.11;
        System.out.println("CGST: "+cgst);
        System.out.println("SGST: " +sgst);
    }
}
