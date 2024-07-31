public class InnerClass {

    class Toy{
        int price =10;
    }
    static class PlayStation{
        int price = 80000;
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        Toy t1 =obj.new Toy();
        System.out.println(t1.price);
        PlayStation p1 = new InnerClass.PlayStation();
        System.out.println(p1.price);
    }
}
