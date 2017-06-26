package com.zhaogang.spring.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zhaogang.spring.boot.framework.interceptors.FrameworkInterceptor;
@Configuration
public class InterceptorConfigurerAdapter extends WebMvcConfigurerAdapter{

	// 多个拦截器组成一个拦截器链  
    // addPathPatterns 用于添加拦截规则  
    // excludePathPatterns 用户排除拦截 
	  public void addInterceptors(InterceptorRegistry registry) {  
	        registry.addInterceptor(new FrameworkInterceptor()).addPathPatterns("/**");  
	        super.addInterceptors(registry);  
	   }  
	  
	  	 /**
	  	  * Spring Boot 默认配置的/**映射到/static（或/public ，/resources，/META-INF/resources）
	     * 配置静态访问资源
	     * @param registry
	     */
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
	        super.addResourceHandlers(registry);
	    }
	    
	    /**
	     * 配置请求 跳转
	     */
	    @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/toLogin").setViewName("welcome");
	        super.addViewControllers(registry);
	    }
}
