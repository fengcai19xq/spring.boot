package com.zhaogang.spring.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.zhaogang.spring.boot.config.listener.MyApplicationStartListener;

@SpringBootApplication /* 相当于 @Configuration,@EnableAutoConfiguration,@ComponentScan */
public class Application extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SpringApplication.run(Application.class, args);*/
		//new SpringApplicationBuilder(Application.class).web(true).run(args);
		SpringApplicationBuilder springApplication = new SpringApplicationBuilder(Application.class);
		springApplication.application().addListeners(new MyApplicationStartListener());
		springApplication.web(true);
		springApplication.run(args);

	}

}
