public class Pattern_12 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.printf(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.printf("%d ",i+1);
            }
            System.out.println();
        }
    }
}
