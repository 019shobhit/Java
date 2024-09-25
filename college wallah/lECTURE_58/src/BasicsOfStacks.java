import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
//        int[] arr = new int[5];
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
    }

}
