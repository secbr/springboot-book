package com.secbro2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * @author sec
 * @version 1.0
 * @date 2020/2/4 4:35 PM
 **/
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// 对于一些简单的请求，比如不需要从后台获取数据的请求，可以采用这种方式直接返回页面，而不需要在Controller中写一些空方法
		registry.addViewController("/hello").setViewName("hello");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		// 设置ViewResolver对应的属性值
		resolver.setCharacterEncoding("UTF-8");
		resolver.setCache(false);
		// ...
		registry.viewResolver(resolver);
	}
}
