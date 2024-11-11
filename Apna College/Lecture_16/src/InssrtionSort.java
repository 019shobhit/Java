public class InssrtionSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,94,5,3,6,4,4};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 &&  arr[j] <arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int i : arr){
            System.out.print(i+", ");
        }
    }
}
