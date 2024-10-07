public class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("%d ",n-j);
            }
            for(int j=0;j<(n-i-1)*2;j++){
                System.out.printf("%d ",n-i);
            }
            for(int j=0;j<i;j++){
                System.out.printf("%d ",n-i+j+1);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.printf("%d ",n-j);
            }
            for(int j=0;j<i*2 -1;j++){
                System.out.printf("%d ",i+1);
            }

            for(int j=0;j<n-i;j++){
                System.out.printf("%d ",i+j+1);
            }
            System.out.println();
        }
    }
}