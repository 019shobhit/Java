//Find the sum of series in which odd number is subtracted and even number is add
// ex  --> if number is 5 then sum is -->  sum=1-2+3-4+5
import java.util.Scanner;
public class SpecialSeriesSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter number to get the sum of special series");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum +=i;
            }
            else {
                sum -= i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
