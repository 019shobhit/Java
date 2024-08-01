import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {
//        Integer obj = new Integer(18);
        Integer obj2 = Integer.valueOf("15");
        System.out.println(obj2*5);
        Integer obj3 = 10; // Autoboxing
        int age = obj2; // Unboxing
        Boolean mybool = Boolean.valueOf(true);

        ArrayList<Integer> arr = new ArrayList<>();
    }
}
