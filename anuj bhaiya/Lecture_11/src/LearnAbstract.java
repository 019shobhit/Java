public class LearnAbstract {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.brake();
        c1.wheels(5);
        c1.honks();
    }
}
abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();
    abstract int wheels(int wheel);
    void honks(){
        System.out.println("Vehicle is honking");
    }
}
class Scooter extends Vehicle{

    void accelerate() {

    }

    void brake() {

    }

    int wheels(int wheel) {
        return 0;
    }
}
class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Carr is Accelerating");
    }

    @Override
    void brake() {
        System.out.println("Car is Breaking");
    }

    @Override
    int wheels(int w) {
        System.out.println("Car have "+w+" wheels");
        return 0;
    }
    void honks(){
        System.out.println("Car is honking");
    }
}
