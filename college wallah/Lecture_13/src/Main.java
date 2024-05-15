import static java.util.Collections.swap;

class Algebra{
    int a=10;
    int b=5;

    int add(){
        return  a+b;
    }
    int sub(){
        return  a-b;
    }
    void demo(){
        int x=10;
        System.out.println(x);
        {
            int y=10;
            System.out.println(y);
        }
        {
            int y=500;
            System.out.println(y);
        }
    }
}
public class Main {
    static void change(int x){
        x=x*x;
        System.out.println("while change: "+x);
    }
    public static void main(String[] args) {
//        Algebra obj=  new Algebra();
//        obj.demo();
        int a=10;
        System.out.println("before change: "+a);
        change(a);
        System.out.println("After change: "+a);

    }
}