package com.zhaogang.spring.boot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhaogang.spring.boot.business.biz.OpenAccountBiz;
import com.zhaogang.spring.boot.business.model.OpenAccount;

@RestController
public class DemoController {

	
	public DemoController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("DemoController 初始化："+this);
	}

	@Autowired
	OpenAccountBiz openAccountBiz ;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello world ";
	}
	
	@RequestMapping("/queryAccount/{id}")
	public OpenAccount queryAccount(@PathVariable("id") Integer id){
		OpenAccount openAccount = openAccountBiz.queryAccount(id);
		return openAccount;
	}
	@RequestMapping("/insert")
	public Map<String,Object> insert(HttpServletRequest request,OpenAccount account){
		Map<String,Object> retMap = new HashMap<String, Object>();
		retMap.put("请求类型", request.getMethod());
		retMap.put("请求参数", request.getParameterMap().toString());
		return  retMap;
	}
	
}
