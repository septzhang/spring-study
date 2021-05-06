import com.ajie.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sept Zhang
 * @create 2021-05-06 15:11
 */
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.getStr();
	}
}
