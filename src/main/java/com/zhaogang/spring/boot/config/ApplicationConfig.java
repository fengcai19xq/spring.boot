package com.zhaogang.spring.boot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="my")
public class ApplicationConfig { 
	    private String name;
	    private Integer age;
	    private List<String> servers = new ArrayList<String>();
	    
		public String getName() {
			return name;
		}
		public Integer getAge() {
			return age;
		}
		public List<String> getServers() {
			return servers;
		}
	    
	    
}
