import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("My error is this: ");
                throw new ArrayIndexOutOfBoundsException("array out of index");
            }

            System.out.println("Age is less tha 100");
        }catch(Exception e){
            System.out.println("Age is greater than 100 so");
            System.out.println(e);
    }
}
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}