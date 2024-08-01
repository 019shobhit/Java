import java.util.*;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> s1 =new HashSet<>();
        s1.add(new Student(1,"shobhit"));
        s1.add(new Student(1,"shobhit"));
        s1.add(new Student(1,"shobhit"));
        System.out.println(s1);

//        Set<String> str = new HashSet<>();
//        str.add("shobhit");
//        str.add("abhi");
//        str.add("shivam");
//        System.out.println(str);

//        Set<Integer> s = new HashSet<>();  // O(1)
//        Set<Integer> s = new LinkedHashSet<>();  // O(n)
//        Set<Integer> s = new TreeSet<>();  //  O(log n)
//        s.add(10);
//        s.add(12);
//        s.add(50);
//        s.add(20);
//        s.add(70);
//        System.out.println(s);
//        System.out.println(s.contains(20));
//        s.remove(50);
//        System.out.println(s);
    }
}
