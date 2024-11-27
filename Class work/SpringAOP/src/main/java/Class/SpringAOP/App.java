package Class.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
    	Car c = context.getBean(Car.class);
    	c.show();    	
    }
    
}
