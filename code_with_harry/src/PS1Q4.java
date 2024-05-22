import java.util.Scanner;
public class PS1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KiloMeter to convrt into miles");
        float a = sc.nextFloat();
        double b = a*(0.621371);
        System.out.println(b);
    }
}
