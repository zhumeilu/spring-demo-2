import com.zml.ioc.test1.UserInfo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class IocTest1 {

	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext1.xml");
		UserInfo bean = ctx.getBean(UserInfo.class);
		System.out.println(bean);
	}

}
