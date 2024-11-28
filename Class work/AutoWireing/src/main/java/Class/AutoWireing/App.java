package Class.AutoWireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("Class/AutoWireing/Config.xml");
        Employee e = con.getBean("emp1",Employee.class);
        e.show();
        
    }
}
