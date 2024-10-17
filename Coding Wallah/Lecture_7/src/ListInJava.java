import java.util.*;

public class ListInJava {
    public static void main(String[] args) {
        // ArrayList
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(2,25);

//        LinkedList
//        List<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(0,5);
//        System.out.println(list.size());

//        Vector
//        Vector<String> vector = new Vector<>();
//        vector.add("a");
//        vector.add("c");
//        vector.add("b");
//        vector.clear();
//        System.out.println(vector);

//        Set
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(8);
        set.add(6);
        set.add(15);
        set.add(15);
        set.add(12);
        System.out.println(set);
        System.out.println(set.contains(15));

    }
}
