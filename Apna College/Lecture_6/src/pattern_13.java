public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.printf("  ");
            }
            for(int j=i+1;j>0;j--){
                System.out.printf("%d ",j);
            }
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",j+1);
            }
            System.out.println();
        }
    }
}
