import com.zml.ioc.test2.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class IocTest2 {

	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		MyBean bean = ctx.getBean(MyBean.class);
	}

}
