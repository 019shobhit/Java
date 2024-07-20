import java.util.Scanner;
public class PS1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Total sum is : ");
        System.out.println(sum);

    }
}
