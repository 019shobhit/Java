import java.util.Scanner;
public class video16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check you can drive or not");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Yes you acn drive");
        } else {
            System.out.println("No, You can not drive");
        }
    }
}
