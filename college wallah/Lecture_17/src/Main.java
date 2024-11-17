public class Main{
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n= arr.length;
        int r = 10;
        r = r % n;
        int k=0;
        int[] rotate = new int[n];
        for(int i=n-r;i<n;i++){
            rotate[k++] = arr[i];
        }
        for(int i=0;i<n-r;i++){
            rotate[k++] = arr[i];
        }
        print(arr);
        System.out.println();
        print(rotate);

    }
}