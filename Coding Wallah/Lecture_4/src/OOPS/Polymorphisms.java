package OOPS;

class A{

    void sub(){
        System.out.println("A");
    }
}
class B extends  A{
    @Override
    void sub(){
        System.out.println("B");
    }
}
public class Polymorphisms {

    //        runtime -> method overriding

//        compile time -> method overloading
    static int sum(int x,int y){
        return x+y;
    }
    static int sum(int x, int y, int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        Polymorphisms p = new Polymorphisms();
        System.out.println(p.sum(1,2));
        System.out.println(p.sum(1,2,3));
        B b = new B();
        b.sub();
    }
}
