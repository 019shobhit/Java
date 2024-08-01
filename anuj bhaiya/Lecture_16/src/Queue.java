import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
    }
}
