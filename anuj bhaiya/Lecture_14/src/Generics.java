import javax.xml.namespace.QName;

public class Generics {

    public static void main(String[] args) {
        Dog<String,String> d1 = new Dog<>("xyz","Dessi");
        Dog<Integer,String > d2 = new Dog<>(12,"Labra");
        System.out.println(d1.id);
        System.out.println(d2.getId());
    }
}
class Dog <E,V>{
    E id ;
    V name;
    public Dog(E id,V name){
        this.id = id;
        this.name = name;
    }
    E getId(){
        return  id;
    }
}