package OOPS;

abstract class abs{
    abstract void run();
}
class man extends  abs{
    void run(){
        System.out.println(" abs is running");
    }
}
class man2 implements inf{
    public void xyz(){
        System.out.println("xyz is implements");
    }
}
interface inf{
    void xyz();
}

public class Abstraction {
    public static void main(String[] args) {
        man m = new man();
        m.run();
        man2 m2 = new man2();
        m2.xyz();
    }
}
