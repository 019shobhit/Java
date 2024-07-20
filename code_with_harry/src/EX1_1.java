import java.util.Scanner;
public class EX1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter all Five subjects marks");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int sum = a+b+c+d+e;
        int p = sum /5;
        System.out.println("Total percentage of a student is ");
        System.out.println(p);
    }
}
