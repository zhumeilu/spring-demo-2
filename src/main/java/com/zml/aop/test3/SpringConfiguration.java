package com.zml.aop.test3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: maylor
 * @date: 2021/5/13 16:00
 * @description:
 */
@Configuration
@ComponentScan("com.zml.aop.test3")
@EnableAspectJAutoProxy //开启spring对注解AOP的⽀持
public class SpringConfiguration {

}
