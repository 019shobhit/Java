public class FinallyBlockInException {

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Hello");
        try{
            arr[4]=5;
            arr[8]=10;
        }
        catch(Exception e){
            System.out.println("All Exception handled");
        }
        finally {
            assert System.out != null;
            System.out.println("I will runs always");
        }
        System.out.println("Bye...");
    }
}
