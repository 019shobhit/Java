class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Queuee{
    int size = 0 ;
    Node front = null;
    Node rear = null ;
    public boolean isEmpty(){
        return front == null && rear == null;
    }
    public void  add(int data){
        Node node = new Node(data);
        if(rear == null){
            front = node;
            rear = node;
        }else{
            rear.next = node;
            rear = node;
        }
        size++;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = front.data;
        if(front == rear){
            rear = null;
        }
        front = front.next;
        size--;
        return temp;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

}
public class LLImplementation {
    public static void main(String[] args) {
        Queuee q =  new Queuee();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
