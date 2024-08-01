public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        System.out.println("Hello Friends");
        try {
            System.out.println(arr[8]);
            int x = 5/0;
        }
        catch (RuntimeException e){
            System.out.println("All exception handled");
        }
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("All exception handled");
//        }
//        catch (ArrayIndexOutOfBoundsException  e){
//            System.out.println("Array Index of Bound Exception caught");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception Caught");
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
//            System.out.println(e);
//        }
        System.out.println("Bye Friends");
    }
}
