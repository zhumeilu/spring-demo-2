package com.zml.tx.test2;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: maylor
 * @date: 2021/5/13 11:21
 * @description:
 */
@Component
public class TestService {
	@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
	public void test() {
		System.out.println("execute TestService.test");
	}
}
