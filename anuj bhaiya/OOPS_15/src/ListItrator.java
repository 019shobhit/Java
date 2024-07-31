import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListItrator {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Appla");
//        fruits.add("Banana");
//        fruits.add("Papaya");
//        fruits.add("Mango");
//        fruits.add("Kivi");
//        List<String> sl = fruits.subList(1,4);
//        System.out.println(sl);

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(50);
        System.out.println(st);
        st.peek();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st.empty());

//        for(int i=0;i<fruits.size();i++){
//            System.out.println(fruits.get(i));
//        }
//        System.out.println();
//        for(String i : fruits){
//            System.out.println(i);
//        }
//        System.out.println();
//        Iterator<String> fr = fruits.iterator();
//        while(fr.hasNext()){
//            System.out.println(fr.next());
//        }
    }
}
