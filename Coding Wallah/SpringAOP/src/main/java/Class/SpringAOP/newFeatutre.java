package Class.SpringAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class newFeatutre {
	@Before("execution(public void show())")
	public void print() {
		System.out.println("Aop code is Running");

	}
}
