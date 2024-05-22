import java.util.Scanner;

public class Main {
    static int totalSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
    static boolean equalSumPartitation(int[] arr){
        int sum = totalSum(arr);
        int prefixsum = 0;
        for(int i=0;i<arr.length;i++){
            prefixsum += arr[i];
            int suffixSum = sum-prefixsum;
            if(prefixsum==suffixSum)
                return true;
        }
        return  false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal Partiation is posible: "+equalSumPartitation(arr));
    }
}