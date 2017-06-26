package com.zhaogang.spring.boot.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaogang.spring.boot.business.biz.OpenAccountBiz;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World ! }")
	private String message = "Hello World";

	@Autowired
	private OpenAccountBiz openAccountBiz ;
	
	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		model.put("account",openAccountBiz.queryAccount(Integer.valueOf(22)));
		return "welcome";
	}

}
