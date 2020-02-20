package SpringFrames;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld o1 = (HelloWorld) context.getBean("helloWorld");
      o1.getMessage();
      Hello o2 = (Hello) context.getBean("mes");
      o2.getMes();
   }
}
