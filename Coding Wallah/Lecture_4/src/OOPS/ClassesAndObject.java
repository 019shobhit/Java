package OOPS;
class Employee{
    private int id ;
    private String name;
    int getId(){
        return id;
    }
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("shobhit");
        System.out.println(e1.getId());
        System.out.println(e1.getName());

    }
}
