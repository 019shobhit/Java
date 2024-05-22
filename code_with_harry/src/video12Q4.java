import java.util.Scanner;
public class video12Q4 {
    public static void main(String[] args) {
        System.out.println("Enter V value");
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
        System.out.println("Enter U value");
        float u = sc.nextFloat();
        System.out.println("Enter Acceleration value");
        float a = sc.nextFloat();
        System.out.println("Enter S value");
        float s = sc.nextFloat();
        System.out.println("The Total expression is : ");
        float x = ((v*v) - (u*u))/2*a*s;
        System.out.println(x);

    }
}
