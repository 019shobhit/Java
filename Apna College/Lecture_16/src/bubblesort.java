public class bubblesort {
    public static void main(String[] args) {
        // bubble sort
        int[] arr = {5,8,6,94,5,3,6,4,4};
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            int flag =0;
            for(int j=i+1;j<n;j++){
                if(arr[i] >arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag =1;
                }
            }
            if(flag == 0) break;
       }

        for(int i : arr){
            System.out.print(i+", ");
        }
    }
}
