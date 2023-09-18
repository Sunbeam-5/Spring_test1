import com.demo.ay.Controller.UserController;
import com.demo.ay.component.UserComponent;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        UserController userController = (UserController) applicationContext.getBean("userController");

        System.out.println(userController.getUser());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));

        UserComponent userComponent = (UserComponent) applicationContext.getBean("userComponent");

        System.out.println(userComponent.getUser());
    }

}
