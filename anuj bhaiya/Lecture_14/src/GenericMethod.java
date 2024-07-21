public class GenericMethod {
    public static void main(String[] args) {
        printData("Hello shobhit");
        printData(123);
        printData(12.356);

        GenericMethod obj = new GenericMethod();
//        obj.doubleData("juihjuh");
        obj.doubleData(123);
        obj.doubleData(12.56);
        CustomClass c = new CustomClass();
//        obj.doubleData(c);
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
