package Lecture_4;

import java.util.Scanner;

public class Program1_PrimeNumber {
    public static boolean checkPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(checkPrime(i)) count++;
        }
        System.out.println(count);
    }
}
