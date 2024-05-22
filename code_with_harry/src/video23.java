import java.util.Scanner;
public class video23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print reverse natural number");
        int a= sc.nextInt();
//        int i;
//        for (i=0 ; i<a ; i++){
//            System.out.println(i*2+1);
//        }
        for (int b = a ; b>=0 ; b--){
            System.out.println(b);
        }
    }
}
