public class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            try {
                if (i == 3) {
                    System.out.println(i / 0);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("I will run always");
            }
            System.out.println(i);
        }


    }
}