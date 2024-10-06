class Queue{
    int arr[];
    int size;
    int rear = -1;
    int front = -1;
    Queue(int size){
        arr = new int[size];
        this.size = size;
    }
    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public boolean isFull(){
        return (rear+1) % size == front;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }else{
            rear = (rear+1) % size;
            arr[rear] = data;
            if(front == -1) front =0;
        }
    }
    public int remove(){
         if(isEmpty()){
             System.out.printf("Your Queue is empty");
             return -1;
         }else{
             int temp = arr[front];
             if( front == rear){
                 rear =-1;
                 front = -1;
             }else{
                 front = (front+1) % size;
             }
             return  temp;
         }
    }
    public int peek(){
        if(isEmpty()){
            System.out.printf("Your Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public void print(){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
//        while(!q.isEmpty()){
//            System.out.print(q.peek()+" ");
//            q.remove();
//        }
        System.out.println();
        q.remove();
        q.add(4);
        q.add(5);
        q.print();
        q.remove();
        q.add(6);
//        while(!q.isEmpty()){
//            System.out.print(q.peek()+" ");
//            q.remove();
//        }
        q.print();

    }
}