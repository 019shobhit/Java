import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        dq.offerLast(20);
//        dq.offerFirst(10);
//        dq.offer(31);
//        dq.offer(32);
//        dq.offer(33);
//        System.out.println(dq);
//        System.out.println(dq.poll());
//        System.out.println(dq.pollLast());
//        System.out.println(dq.pollFirst());
//        System.out.println(dq);
        dq.push(10);
        dq.push(20);
        dq.push(30);
        dq.push(40);
        System.out.println(dq);

    }
}
