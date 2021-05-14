package com.zml.ioc.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: maylor
 * @date: 2021/3/15 18:05
 * @description:
 */
public class MyBean implements InitializingBean {
	Logger logger = LoggerFactory.getLogger(MyBean.class);

	public MyBean() {
		logger.info("MyBean.construct run");
	}

	@Override public void afterPropertiesSet() throws Exception {
		logger.info("MyBean.afterPropertiesSet run");
	}
}
