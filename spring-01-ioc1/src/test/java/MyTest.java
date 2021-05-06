import com.ajie.dao.UserDaoImpl;
import com.ajie.dao.UserMySQLDaoImpl;
import com.ajie.dao.UserOrcalDaoImpl;
import com.ajie.service.UserService;
import com.ajie.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sept Zhang
 * @create 2021-05-05 16:05 /.
 */
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) context.getBean("service");
		service.getUser();
	}

}
