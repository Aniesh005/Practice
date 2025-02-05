import java.util.Scanner;
public class CharacterCampare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first characte");
        char a = sc.next().charAt(0);
        System.out.println("Enter the Second character: ");
        char b = sc.next().charAt(0);
        CompareNo(a,b);
    }
    public static void CompareNo(char a, char b){
            System.out.println(a+" < "+b+ " is " +(a<b));
            System.out.println(a+" <= "+b+ " is " +(a<=b));
            System.out.println(a+" > "+b+ " is " +(a>b));
            System.out.println(a+" >= "+b+ " is " +(a>=b));
            System.out.println(a+" == "+b+ " is " +(a==b));
            System.out.println(a+" != "+b+ " is " +(a!=b));
    }  
}
