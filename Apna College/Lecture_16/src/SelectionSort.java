public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,94,5,3,6,4,4};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int max_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[max_idx] >arr[j]) max_idx = j;
            }
            if(max_idx != i){
                int temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i : arr){
            System.out.print(i+", ");
        }
    }
}
