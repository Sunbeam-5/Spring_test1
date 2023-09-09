import com.demo.ay.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        UserController userController = (UserController) applicationContext.getBean("userController");

        System.out.println(userController.getUser());

    }

}
