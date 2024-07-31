package learnEncapsulation;

import learnPackage.Person;

public class MainInEncapsulation {

    public static void print_hello(){
        System.out.println("Hello, this is shobhit");

    }
    public void hi(){
        System.out.println("Hi");
    }
    public void hlo(){
        System.out.println("hello");
        hi();
    }
//    static {
//        System.out.println("Static block");
//    }
    public static void main(String[] args) {
//        System.out.println("Main");
//        MainInEncapsulation.print_hello();
//        MainInEncapsulation x1= new MainInEncapsulation();
//        x1.hlo();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
//        print_hello();
        p1.setAge(20);
//        System.out.println("The age is: "+p1.getAge());
//        p2.setName("Shobhit");
//        p2.setName("Shobhit");
//        p2.setName("Shobhit");
//        System.out.println("Yhe name is: "+p1.getName());
//        p1.count = 10;
//        Person.ab =12;
        System.out.println(Person.ab);
        System.out.println(Math.PI);
//        System.out.println(Person.count);
//        System.out.println(Math.max(4,5));
    }
}
