
class Employee{
    private int id=1 ;
    private String name = "Shobhit";
    private int incentive = 500;
    private int salary = 20000;
    private void totalSalary(){
        System.out.println(salary+incentive);
    }
    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
}

public class Test {
    public static void main(String[] args) {
//        Employee em = new Employee();
//        em.totalSalary();
//        System.out.println(Employee.id);
//        Employee.totalSalary();
    }
}