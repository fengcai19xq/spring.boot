package com.zhaogang.spring.boot.config;

import org.springframework.boot.CommandLineRunner;

import com.zhaogang.config.service.init.InitContextLoaderListener;
/*@Component
@Order(1)*/
public class InitZkConfig extends InitContextLoaderListener implements CommandLineRunner  {

	public InitZkConfig() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitZkConfig run ..........");
	}

	
}
