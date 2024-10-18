import java.io.FileReader;

public class Main{
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,6};
        try {
            throw  new Exception("chla ja bhaishab");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        xyz.pass(20);
        for(int i=0;i<arr.length;i++){
            try {
                if (i == 3) {
                    System.out.println(i / 0);
                }
                throw new Exception("nikal be");
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