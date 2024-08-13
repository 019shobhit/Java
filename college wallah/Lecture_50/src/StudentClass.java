import java.util.Scanner;
public class StudentClass {
    //creating a new data type
    static class student{
        String name;
        int roll_no;
        double percent;
    }
    public static void main(String[] args) {
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        s1.name = "Shobhit";
        s1.roll_no = 44;
        s1.percent = 77.6;
        System.out.println(s1.name);

    }
}
