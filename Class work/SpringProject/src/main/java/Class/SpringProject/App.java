package Class.SpringProject;
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
//        Car c = new Car();
//        c.info();
    	ApplicationContext cont = new ClassPathXmlApplicationContext("Class/SpringProject/config.xml");
    	Car c1 = cont.getBean("car1",Car.class);
    	c1.info();
    	Bike b1 = cont.getBean("Bike",Bike.class);
    	b1.print();;
    }
}
