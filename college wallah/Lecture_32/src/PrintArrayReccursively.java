import java.util.Scanner;

public class PrintArrayReccursively {

    static  void printArray(int[] arr,int n){
        if(n== arr.length) {
            return;
        }
        System.out.println(arr[n]);
        printArray(arr,n+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr,0);
    }
}
