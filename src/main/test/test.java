import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

  @Test
  public void test01() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    User user = applicationContext.getBean("user", User.class);
    System.out.println(user);
  }
  @Test
  public void test2(){
    Integer a=10;
    Integer b=9;
    System.out.println(a/b);
  }
}
