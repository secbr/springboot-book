package com.secbro2.controller;

import com.secbro2.entity.LoginUserConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sec
 * @version 1.0
 * @date 2020/2/2 9:27 AM
 **/
@RestController
public class ConfigController {

	@Value("${user.username}")
	private String username;

	@Value("${user.password}")
	private String password;

	@Resource
	private LoginUserConfig loginUserConfig;

	@Value("${projectName:unknown}")
	private String projectName;

	@RequestMapping("/")
	public String getConfigParams() {

		// 启动命令传递参数
		System.out.println("Command config projectName:" + projectName);

		// 通过application配置文件配置的参数
		System.out.println("Application config Username : " + username);
		System.out.println("Application config Password : " + password);

		// 通过@ConfigurationProperties注解配置的参数
		System.out.println("ConfigurationProperties config Username : " + loginUserConfig.getUsername());
		System.out.println("ConfigurationProperties config Password : " + loginUserConfig.getPassword());

		return "";
	}
}
