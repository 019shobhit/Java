package practice;

import java.util.Scanner;

public class PascalTriangle extends TransposeMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[][] arr = pascal(n);
        print(arr);

    }
    static  int[][] pascal(int n){
        int[][] ans = new int[n][];

        for(int i=0;i<n;i++){
            ans[i] = new int[i+1];
            ans[i][0] = 1;
            ans[i][i]=1;

            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }

        return  ans;
    }
}
