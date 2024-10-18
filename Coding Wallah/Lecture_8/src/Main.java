import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Queue
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.offer(20);
//        q.offer(15);
//        q.add(50);
//        q.poll();
//        System.out.println(q);
//        System.out.println(q.offer(12));

//        Deque Queue
//        Deque<Integer> q = new ArrayDeque<>();
//        q.offerFirst(10);
//        q.offerFirst(20);
//        q.pollLast();
//        System.out.println(q);

//        Priority Queue
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.offer(6);
//        pq.offer(1);
//        pq.offer(12);
//        pq.add(4);
//        pq.add(8);
//        System.out.println(pq);

//        HashMap
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//        map.put(4,4);
//        map.put(5,5);
//        System.out.println(map.get(4));
//        map.values();
//        System.out.println(map.keySet());

//        Arrays functions
        int[] arr = {1,2,3,4,4,4,4,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(arr,5));
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("afourth");
        System.out.println(list);
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}