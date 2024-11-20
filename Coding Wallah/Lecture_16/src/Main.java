import java.sql.Connection;
import java.sql.DriverManager;

public class Main{
    public static void main(String[] args) {
        // driver load
//        connection establish
//        execute statement
//        run query
//        close connection
        try{
            String url = "jdbc:mysql://localhost:3306";
            String userName = "root";
            String password = "shobhit2002";
            Connection con = DriverManager.getConnection(url,userName,password);

        }
    }
}