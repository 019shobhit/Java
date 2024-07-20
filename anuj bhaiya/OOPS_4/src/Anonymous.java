public class Anonymous {
    OuterClass obj = new OuterClass(){
        void sing(){
            System.out.println("Inner Class is singing");
        }
        public void outerObject(){
            System.out.println("Object Inner Class");
        }
    };
    SuperInterface ob = new SuperInterface() {
        @Override
        public void interfaceMethod() {
        }
    };
    public static void main(String[] args) {
        Walkable objwalk = (int steps) -> {
            System.out.println("Wlaked Steps are: "+steps);
            return steps;
        };
        SuperInterface obj1 = () -> {
            System.out.println("SuperInterface With Functional interface");
        };
        Walkable oobj = (x) -> 2*x;
        System.out.println(oobj.walk(50));
        obj1.interfaceMethod();
        objwalk.walk(20);
    }
}
@FunctionalInterface
interface Walkable{
    int walk(int steps);
}

class OuterClass{
    public void outerObject(){
        System.out.println("Object of outer Class");
    }
}
@FunctionalInterface
interface  SuperInterface{
    void interfaceMethod();
}
