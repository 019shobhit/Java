public class Vehicle {
    final int gears =4;

    public static void main(String[] args) {
        Vehicle  v = new Vehicle();

        System.out.println(v.gears);
    }
    int wheelsCount;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle Instance");
    }
    Vehicle(int wheelsCount){
        this.wheelsCount=wheelsCount;
        System.out.println("Creating Vehicles With wheels");
    }

    void start() {
        System.out.println("Vehicle is Starting");
    }

    final void acc(){
        System.out.println("Vehicle is Accelerating");
    }
}
