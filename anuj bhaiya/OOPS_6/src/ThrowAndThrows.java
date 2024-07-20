public class ThrowAndThrows {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            getNumberFromArray(arr);
        }catch(RuntimeException e){
            System.out.println("Arithmetic Acception Caught");
        }
    }
    static int getNumberFromArray(int[] arr) throws  ArithmeticException{
        return  arr[8];
    }
}
