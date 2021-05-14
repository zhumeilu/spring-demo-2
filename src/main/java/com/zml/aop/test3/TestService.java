package com.zml.aop.test3;

import org.springframework.stereotype.Component;

/**
 * @author: maylor
 * @date: 2021/5/13 11:21
 * @description:
 */
@Component
public class TestService {

	public void test() {
		System.out.println("execute TestService.test");
	}
}
