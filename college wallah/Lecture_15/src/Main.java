import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,10};
        int[] arr2 = Arrays.copyOfRange(arr,1,4);
        printArray(arr);
        printArray(arr2);
        changeArray(arr2);
        printArray(arr);
        printArray(arr2);
    }
}