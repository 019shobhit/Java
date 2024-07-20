import java.util.Scanner;
public class video22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbar to print natural number");
        int n = sc.nextInt();
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a<=n);
    }
}
