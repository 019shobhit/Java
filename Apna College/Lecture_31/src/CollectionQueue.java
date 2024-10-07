import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class xyz{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public boolean isEmpty(){
        return st1.isEmpty();
    }
    public void add(int data){
        while(st1.isEmpty()){
            st2.push(st1.pop()) ;
        }
        st1.push(data);
        while(st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    int remove(){
        if(isEmpty()){
            System.out.printf("Queue is empty");
            return  -1;
        }
        return st1.pop();
    }
    int peek(){
        if(isEmpty()){
            System.out.printf("Queue is empty");
            return  -1;
        }
        return st1.peek();
    }
}
public class CollectionQueue {
    public static void main(String[] args) {
        xyz x = new xyz();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
    }
}
