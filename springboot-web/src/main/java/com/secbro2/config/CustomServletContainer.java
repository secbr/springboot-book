package com.secbro2.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * @author sec
 * @version 1.0
 * @date 2020/2/4 5:33 PM
 **/
@Component
public class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setPort(8080);
		factory.setContextPath("/");
		// ...
	}
}
