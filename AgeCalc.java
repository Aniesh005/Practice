import java.util.Scanner;
public class AgeCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of Birth: ");
        int date = sc.nextInt();
        System.out.println("Enter Month of Birth: ");
        int month = sc.nextInt();
        System.out.println("Enter Year of Birth: ");
        int year = sc.nextInt();
        System.out.println("Enter CurrentDate: ");
        int Currentdate = sc.nextInt();
        System.out.println("Enter Current Month: ");
        int Currentmonth = sc.nextInt();
        System.out.println("Enter Current Year: ");
        int Currentyear = sc.nextInt();
        int age = Currentyear - year;
        if((Currentmonth< month) || (Currentdate<date)){
            age--;
        }
        System.out.println("Age: "+age+"years");
    }
    
}
