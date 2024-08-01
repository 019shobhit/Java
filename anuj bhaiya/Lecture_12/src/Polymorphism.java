import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

class Datax{
    int data;

    public void printData(){
        System.out.println(data);
    }
}
class ChildData extends Datax{
    @Override
    public void printData(){
        System.out.println("Overriden Data is:"+data);
    }
    public void xyz(){

    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Object obj = new ChildData();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();
        Datax d = new ChildData();
        ChildData d1 = new ChildData();

    }
}
