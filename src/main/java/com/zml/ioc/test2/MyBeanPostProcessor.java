package com.zml.ioc.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: maylor
 * @date: 2021/3/15 17:55
 * @description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	Logger logger = LoggerFactory.getLogger(MyBeanPostProcessor.class);

	public MyBeanPostProcessor() {
		logger.info("MyBeanPostProcessor构造方法 运行===========>");
	}

	@Override public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("myBean".equals(beanName)) {
			logger.info("postProcessBeforeInitialization:{}",beanName);

		}
		return bean;
	}

	@Override public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("myBean".equals(beanName)) {
			logger.info("postProcessAfterInitialization:{}",beanName);

		}
		return bean;
	}
}
