public class GenericMethod {

    public static void main(String[] args) {
        printData(123);
        printData("yuvgeifvgy");
        GenericMethod obj = new GenericMethod();
        obj.doubleData(12);

        CustomClass c1= new CustomClass();
//        obj.doubleData(c1);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }
    <E extends  Number> void doubleData(E data){
        System.out.println(data);
    }
}
class CustomClass{

}