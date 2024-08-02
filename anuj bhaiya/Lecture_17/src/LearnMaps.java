import java.util.*;

public class LearnMaps {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        map.put(1,"rohit");
        map.put(2,"abhishek");
        map.put(3,"Shobhit");
        System.out.println(map);
//        System.out.println(map.values());
        Set<Integer> set = map.keySet();
        System.out.println(set);
        Collection<String> value = map.values();
        System.out.println(value);

//        map.replace(3,"xyz");
//        map.remove(2);
//        System.out.println(map.getOrDefault(4,"Unknown"));
//        map2.put(11,"shobhit");
//        map2.put(21,"abhishek");
//        map2.put(31,"rohit");
//        map2.putIfAbsent(31,"indori");
//        System.out.println(map);
//        System.out.println(map2);
//        map2.putAll(map);
//        System.out.println(map2);
//        System.out.println(map.containsValue("shobhit"));
    }
}
