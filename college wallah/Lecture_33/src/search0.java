import java.util.Scanner;

public class search0 {

    static boolean find(int[] arr,int n,int x){
        if(n>=arr.length) return false;
        if(arr[n]==x) return  true;

        return  find(arr,n+1,x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target to be searched: ");
        int x = sc.nextInt();
        if(find(arr,0,x)){
            System.out.println("yes target is present in the array");
        }
        else{
            System.out.println("No target is not present in the array");
        }
    }
}
