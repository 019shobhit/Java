class Data{
    int data ;
}
public class HeapAndStackMemory {
    public static void main(String[] args) {
        Data objx = new Data();
        objx.data = 5;
        int a = 2;
        System.out.println(a);
        changeValue(a,objx);
        System.out.println(a);
        System.out.println(objx.data);
    }
    static void changeValue(int x,Data obj){
        x = 10;
        obj.data = 100;
    }
}
