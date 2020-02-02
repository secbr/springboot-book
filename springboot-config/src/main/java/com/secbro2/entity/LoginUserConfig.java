package com.secbro2.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sec
 * @version 1.0
 * @date 2020/2/2 9:34 AM
 **/
@Component
@ConfigurationProperties(prefix = "user")
public class LoginUserConfig {

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
