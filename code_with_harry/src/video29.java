import java.util.Scanner;
public class video29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // QUESTION 1
//        float []arry ={14.65f, 86.52f, 88.00f, 72.89f, 44.45f};
//        float sum = 0.0f;
//        for(float element:arry){
//            sum = sum + element;
//        }
//        System.out.printf("The total sum of the arry is %f",sum);

        // QUESTION 2
//        System.out.println("Enter number to check the value is present or not in the arry");
//        int []arry = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int n= sc.nextInt();
//        int findnum = n;
//        boolean isinarry = false ;
//        for(int element:arry){
//            if(findnum == element){
//                isinarry = true ;
//                break;
//            }
//        }
//        if(isinarry==true){
//            System.out.println("The value is present in the arry");
//        }
//        else{
//            System.out.println("The value is not present in the arry");
//        }

        // QUESTION 3
//        float []arry ={14.65f, 86.52f, 88.00f, 72.89f, 44.45f};
//        float sum = 0.0f;
//        for(float element:arry){
//            sum = sum + element;
//        }
//        System.out.printf("The total average marks of an arry  is %f",sum/ arry.length);

        // QUESTION 4
//        int [][]mat1 = {{1,2,3}, {4,5,6}};
//        int [][]mat2 = {{10,11,12}, {13,14,15}};
//        int [][]result = {{0,0,0,}, {0,0,0,}};
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.printf("%d ",result[i][j] );
//            }
//            System.out.println("");
//        }

        // QUESTION 5
//        String []arry = {"A", "B", "C", "D", "E"};
//        int l = arry.length;
//        int a = Math.floorDiv(arry.length, 2);
//        String temp;
//        for(int i=0; i<a; i++){
//            temp = arry[i];
//            arry[i] = arry[l-1-i];
//            arry[l-1-i] = temp;
//        }
//        for (String element:arry){
//            System.out.println(element);
//        }

        // QUESTION 6
//        int []array = {2,8,-15,-26,6};
//        int max = Integer.MIN_VALUE;
//        for(int e:array){
//            if(e>max){
//                max =e;
//            }
//        }
//        System.out.println(max);

        // QUESTION 7

//        int []array = {2,8,-15,26,6};
//        int min = Integer.MAX_VALUE ;
//        for(int e:array){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println(min);

        // QUESTION 8

        int []array = {2,8,15,26,26};
        boolean issorted = true;
        for(int i=0; i< array.length-1;i++){
            if(array[i]>array[i+1]){
                issorted =false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not Sorted");
        }
    }
}
