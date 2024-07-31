package learnPackage;

public class Person {
    private int age ;
    private String name;
    public static  int count = 0;
    public static final int ab = 12;

    public Person(){
        count++;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
