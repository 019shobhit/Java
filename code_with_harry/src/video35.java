public class video35 {
    // QUESTION 1
//    public static void multi(int n){
//        for(int i=1; i<11; i++){
//            System.out.println(n + "  X  "+i+"  =  "+n*i);
//        }
//    }
//    public static void main(String[] args) {
//        multi(5);
//    }

    // QUESTION 2
//    public static void pattern(int n){
//        for(int i=0;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.printf(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//    public static void main(String[] args) {
//        pattern(5);
//    }

    // QUESTION 3
//    public static int sum(int n ){
//        if(n==1){
//            return 1;
//        }
//        else{
//            return  n + sum(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(4));
//    }

    // QUESTION 4
//    public static void pattern(int n){
//        for(int i=0; i<n; i++){
//            for(int j=(n-i); j>0; j--){
//                System.out.printf(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//    public static void main(String[] args) {
//     pattern(8);
//    }

    // QUESTION 5
//    public static int fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        else if(n==1){
//            return 1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(10));
//    }

    // QUESTION 7
    public static void pattern(int n){
        if(n>0){
            for(int i=0; i<n; i++){
                System.out.print(" *");
            }
            System.out.println("");
            pattern(n-1);
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }

    // QUESTION 8
//    public static void pattern1(int n){
//        if(n>0){
//            pattern1(n-1);
//            for(int i=0; i<n; i++){
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//    public static void main(String[] args) {
//        pattern1(5);
//    }
}