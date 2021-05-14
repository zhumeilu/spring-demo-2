import com.zml.tx.test1.TestService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class TxTest1 {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-tx.xml");
		TestService bean = ctx.getBean(TestService.class);
		System.out.println(bean);
	}
}
