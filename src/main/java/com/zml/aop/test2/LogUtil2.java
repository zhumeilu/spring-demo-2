package com.zml.aop.test2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: maylor
 * @date: 2021/5/13 11:20
 * @description:
 */
@Component
@Aspect
public class LogUtil2 {

	@Pointcut("execution(* com.zml.aop.test2.*.*(..))")
	public void pointcut(){}
	@Before("pointcut()")
	public void beforePrintLog(JoinPoint jp){
		Object[] args = jp.getArgs();
		System.out.println("前置通知：beforePrintLog，参数是："+
				Arrays.toString(args));
	}
	@AfterReturning(value = "pointcut()",returning = "rtValue")
	public void afterReturningPrintLog(Object rtValue){
		System.out.println("后置通知：afterReturningPrintLog，返回值是："+rtValue);
	}
	@AfterThrowing(value = "pointcut()",throwing = "e")
	public void afterThrowingPrintLog(Throwable e){
		System.out.println("异常通知：afterThrowingPrintLog，异常是："+e);
	}
	@After("pointcut()")
	public void afterPrintLog(){
		System.out.println("最终通知：afterPrintLog");
	}
	/**
	 * 环绕通知
	 * @param pjp
	 * @return
	 */
	@Around("pointcut()")
	public Object aroundPrintLog(ProceedingJoinPoint pjp){
		//定义返回值
		Object rtValue = null;
		try{
			//前置通知
			System.out.println("前置通知");
			//1.获取参数
			Object[] args = pjp.getArgs();
			//2.执⾏切⼊点⽅法
			rtValue = pjp.proceed(args);
			//后置通知
			System.out.println("后置通知");
		}catch (Throwable t){
			//异常通知
			System.out.println("异常通知");
			t.printStackTrace();
		}finally {
			//最终通知
			System.out.println("最终通知");
		}
		return rtValue;
	}

}
