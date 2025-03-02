import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        int TotalMarks = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=5;i++){
            System.out.println("Enter the Subject " +i+" marks: ");
            int marks = sc.nextInt();
            if(marks<=100 && marks>0){
                TotalMarks = TotalMarks+marks;
            }
        }
        double percentage = TotalMarks/5.0;
        System.out.println("Mark Percentage: "+percentage);
    }
}