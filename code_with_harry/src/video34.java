public class video34 {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    static int factorial(int n){
        int total = 1;
        for(int i=1; i<=n;i++){
            total = i*total;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(fact(7));
        System.out.println(factorial(7));
    }
}
