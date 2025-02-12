public class ArrayImplementation {
    public static class QueueArray{
        int front =-1;
        int rear = -1;
        int size =0;
        int[] arr = new int[100];

        void add(int x){
            arr[++front]=x;
            if(front == -1){

            }
            front++;
        }
    }
    public static void main(String[] args) {

    }
}
