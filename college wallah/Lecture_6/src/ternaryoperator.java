import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        String ans;

        ans = (num % 2 ==0) ? "even" : "odd";
        System.out.println(ans);
    }
}
