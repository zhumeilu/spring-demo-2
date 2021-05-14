import com.zml.ioc.test2.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maylor
 * @date: 2021/3/15 18:10
 * @description:
 */
public class IocTestCode {

//	全限定⽅法名 访问修饰符 返回值 包名.包名.包名.类名.⽅法名(参数列表)
//	全匹配⽅式：
//	public void com.lagou.service.impl.TransferServiceImpl.updateAccountByCardNo(com.lagou.pojo.Account)
//	访问修饰符可以省略
//	void com.lagou.service.impl.TransferServiceImpl.updateAccountByCardNo(com.lagou.pojo.Account)
//	返回值可以使⽤*，表示任意返回值
// 	* com.lagou.service.impl.TransferServiceImpl.updateAccountByCardNo(com.lagou.pojo.Account)
//	包名可以使⽤.表示任意包，但是有⼏级包，必须写⼏个
// 	* ....TransferServiceImpl.updateAccountByCardNo(com.lagou.pojo.Account)
//	包名可以使⽤..表示当前包及其⼦包
// 	* ..TransferServiceImpl.updateAccountByCardNo(com.lagou.pojo.Account)
//	类名和⽅法名，都可以使⽤.表示任意类，任意⽅法
// 	* ...(com.lagou.pojo.Account)
//	参数列表，可以使⽤具体类型
//	基本类型直接写类型名称 ： int
//	引⽤类型必须写全限定类名：java.lang.String
//	参数列表可以使⽤*，表示任意参数类型，但是必须有参数
// 	* *..*.*(*)
//	参数列表可以使⽤..，表示有⽆参数均可。有参数可以是任意类型
// 	* *..*.*(..)
//	全通配⽅式：
//	* *..*.*(..)

}
