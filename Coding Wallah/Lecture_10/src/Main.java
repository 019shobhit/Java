import java.io.*;

public  class Main {
    public static void main(String[] args) throws  Exception {
        System.out.println("File Handling in Java");
//        File file = new File("abc.txt");
//        file.createNewFile();
//        System.out.println(file.exists());
//        FileWriter fw = new FileWriter("abc.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
////        fw.write("Hi I am Shobhit Chauhan");
////        fw.close();
//        bw.write("Hello this is shobhit");
//        bw.close();
        FileReader fr = new FileReader("abbb.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        fr.close();
    }
}