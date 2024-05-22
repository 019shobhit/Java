import java.util.Scanner;
public class video18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Your Age to check in which category you are able to stand");
        String ch = sc.next();
        switch (ch){
            case "shobhit":
                System.out.println("My self Shobhit");
                break;
            case "Aaryan":
                System.out.println("My self aaryan");
                break;
            case "Ujjwal":
                System.out.println("My slef ujjwal");
                break;
            default:
                System.out.println("i am Random");
        }





        /*
        if(age<18){
            System.out.println("You are under age");
        }
        else if(age <50){
            System.out.println("you have a perfect age");
        }
        else {
            System.out.println("you are expired");
        }
         */
    }
}
