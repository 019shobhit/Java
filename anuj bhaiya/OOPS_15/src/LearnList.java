import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(30);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.contains(20));
//        list.remove(Integer.valueOf(20));
//        list.addAll(l);
//        list.removeAll(l);
//        list.retainAll(l);
//        list.clear();
        Object a[] = list.toArray();

        for(Object i : a){
            Integer temnp = (Integer)i;
            System.out.print(temnp+" ");
        }

        System.out.println(list);
    }
}
