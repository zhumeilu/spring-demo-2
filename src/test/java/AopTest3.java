import com.zml.aop.test3.SpringConfiguration;
import com.zml.aop.test3.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class AopTest3 {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		TestService bean = ctx.getBean(TestService.class);
		bean.test();
	}
}
