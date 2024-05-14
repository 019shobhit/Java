
import java.util.Scanner;


class Algebra{

    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("Constructor of Algebra class called");
        a=x;
        b=y;
    }

    int add(){
        return a+b;
    }
    int sub(){
    return a-b;
    }
    int mul(){
        return  a*b;
    }
    int div(){
        return a/b;
    }
}
public class Main {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra(5,7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to get sum");
//        int a= sc.nextInt();
//        int b=sc.nextInt();


        int x=obj1.add();
        System.out.println("Sum of the two number is "+ x);
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());
        System.out.println(obj1.div());

        Algebra obj2 =new Algebra(10,7);
        System.out.println();
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());
    }
}