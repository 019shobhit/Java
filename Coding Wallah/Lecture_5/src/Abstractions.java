abstract class abs {
    abstract void print();
}
class rel extends abs{
    void print(){
        System.out.println("rel is  printing");
    }
}
interface  inf{
    void pr();
}
class abc implements inf{
    public void pr(){
        System.out.println("pr is printing");
    }
}
public class Abstractions {
    public static void main(String[] args) {
        rel r = new rel();
        r.print();
        abc a = new abc();
        a.pr();
    }
}
