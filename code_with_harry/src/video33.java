public class video33 {
//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a , int b, int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){
        int total=0;
        for(int e:arr){
            total = total +e;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Verags Tutorials");
        System.out.println("the sum of 4 and 5 is : " + sum(4,5));
        System.out.println("the sum of 4, 5 and 6 is : " + sum(4,5,6));
        System.out.println("the sum of 4, 5, 6 and 7 is : " + sum(4,5,6,7));
        System.out.println("the sum of 4, 5, 6 and 7 is : " + sum(4,5,6,7,8,9,10));
    }
}
