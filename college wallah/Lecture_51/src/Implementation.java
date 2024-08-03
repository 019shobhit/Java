public class Implementation {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class SelfLinkedList{
        Node head;
        Node tail;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtBegning(int data){
            Node temp = new Node(data);
            if(temp == null){
                head = null;
            }else{
                temp.next = head;
                head = temp;
            }
            tail = temp;
        }
        void displayll(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp .next;
            }
        }
        int size(){
            int count =0;
            Node temp = head;
            while(temp != null){
                count ++;
                temp = temp.next;
            }
            return  count;
        }
    }

    public static void main(String[] args) {
        SelfLinkedList ll = new SelfLinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.displayll();
        System.out.println();
        ll.insertAtEnd(8);
        ll.insertAtEnd(12);
        ll.insertAtEnd(14);
        ll.displayll();
        System.out.println();
//        System.out.println(ll.size());
        ll.insertAtBegning(1);
        ll.displayll();
    }
}
