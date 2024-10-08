import java.io.File;

public class Main{
    public static void main(String[] args) throws  Exception {
        System.out.println("File Handling in Java");
        File file = new File("abc.txt");
        file.createNewFile();
        System.out.println(file.exists());
    }
}