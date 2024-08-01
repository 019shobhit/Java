public class Interface {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.eat();
        m1.likeMonkey();
        m1.walk();
        m1.fresh();
        System.out.println(Animal.x);
    }
}

interface  Animal {
    int x = 29;
    void eat();
    void walk();
    default void fresh(){
        System.out.println("Animal get fresh");
    }
}
@FunctionalInterface
interface Human {
    void likeMonkey();
//    void walk();
}
class Monkey implements Animal, Human{
    public void eat() {
        System.out.println("Monkey is Eating");
    }
    public void walk(){
        System.out.println("Monkey is walking");
    }

    public void likeMonkey() {
        System.out.println("Monkey is like Human");
    }
}
