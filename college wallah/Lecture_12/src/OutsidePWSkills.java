import pw.skills.App;

public class OutsidePWSkills {

    public static void main(String[] args) {
        App obj = new App();
//        System.out.println("Outside package: "+obj.str1);
        App3 obj3 = new App3();
        obj3.fromChildClass();
    }
}
class App3 extends App{
    void fromChildClass(){
        App3 obj3 = new App3();
//        System.out.println("Child Class: "+obj3.str1);
    }
}
