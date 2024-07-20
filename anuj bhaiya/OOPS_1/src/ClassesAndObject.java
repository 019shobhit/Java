public class ClassesAndObject {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.name="tommy";
//        d1.bark();
//        d1.walk();
//        Dog d2 = new Dog();
//        d2.name ="kittu";
//        d2.walk();
//        d2.bark();

//        Complex c1 = new Complex();
//        c1.a=5;
//        c1.b=8;
//        c1.print();
    }
}
//class Complex{
//    int a,b;
//    void print(){
//        System.out.println(a+" + "+b+"i");
//    }
//}

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is Walking");
    }
    void bark(){
        System.out.println(name+" is Barking");
    }
}
class Cat{

}