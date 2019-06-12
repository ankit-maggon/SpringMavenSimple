import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class Hello {
	
	public static void main(String[] args) {
	//	AbstractApplicationContext aC= new FileSystemXmlApplicationContext("Configuration.xml");
		AbstractApplicationContext aC= new ClassPathXmlApplicationContext("Configuration.xml");
		Hello hello=(Hello)aC.getBean("hello");
		hello.welCome();
		((AbstractApplicationContext) aC).close();
	}
	
 public void welCome()
 {
	System.out.println("Welcome to Spring"); 
 }

}
