public class Car extends Vehicle {

    void start() {
        Break b1 =new Break();
        b1.braking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model + " Car is Starting");
    }
//    void acc(){
//        System.out.println("Car is Accelerating");
//    }
    Car() {
        super(2);
        System.out.println("Car is Being Creating");
    }

    public static void main(String[] args) {
        Car obj = new Car();
//        System.out.println(obj.wheelsCount);
//        obj.wheelsCount = 4;
//        obj.model = "Creta";
//        obj.start();
//        System.out.println(obj.wheelsCount);
        obj.acc();
    }
}

final class Break{
    void braking(Car car) {
        System.out.println(car.model + " is breaking");
    }
}



