package com.zml.ioc.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author: maylor
 * @date: 2021/3/15 17:55
 * @description:
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	Logger logger = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

	public MyBeanFactoryPostProcessor() {
		logger.info("MyBeanFactoryPostProcessor构造方法 运行===========>");
	}

	@Override public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		logger.info("MyBeanFactoryPostProcessor.postProcessBeanFactory run");
	}
}
