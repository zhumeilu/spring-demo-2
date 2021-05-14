package com.zml.ioc.test1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: maylor
 * @date: 2021/5/12 19:30
 * @description:
 */
@Getter
@Setter
public class UserInfoFactoryBean implements FactoryBean<UserInfo> {

	private String username;
	private String password;
	@Override public UserInfo getObject() throws Exception {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		return userInfo;
	}

	@Override public Class<?> getObjectType() {
		return UserInfo.class;
	}
}
