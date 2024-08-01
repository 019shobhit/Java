import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(20);
        dq.offerFirst(10);
        dq.offer(30);
        System.out.println(dq);

    }
}
