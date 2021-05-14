import com.zml.aop.test2.TestService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class AopTest2 {

	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop2.xml");
		TestService bean = ctx.getBean(TestService.class);
		bean.test();
	}

}
