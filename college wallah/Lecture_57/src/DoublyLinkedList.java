public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void display2(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }
    }
    public static void displayRandom(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static Node insertionAtHead(Node head,int x){
        Node node = new Node(x);
        node.next = head;
        return node;
    }
    public static void insertionAtTail(Node head,int x){
        Node node = new Node(x);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n2.prev= n1;
        n3.prev = n2;
        n4.prev = n3;

        display(n1);
        System.out.println();
//        display2(n4);
//        System.out.println();
//        displayRandom(n3);

        Node head = insertionAtHead(n1,5);
        display(head);
        insertionAtTail(head,50);
        System.out.println();
        display(head);

    }
}
