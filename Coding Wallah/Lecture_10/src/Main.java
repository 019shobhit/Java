import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,15,96,86};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String s1 = String.valueOf(arr[i]);
                String s2 = String.valueOf(arr[j]);
                if((s1+s2)>(s2+s1)){

                }
            }
        }
    }
}