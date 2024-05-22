import java.sql.SQLOutput;
import java.util.Scanner;
public class PS1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subject marks");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int sum = a+b+c;
//        int avg = sum/30;
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float SUM = A+B+C;
        float AVG = SUM/30;
        System.out.println("The CGPa of the given Mrks is : ");
//        System.out.println(avg);
        System.out.println(AVG);
    }
}
