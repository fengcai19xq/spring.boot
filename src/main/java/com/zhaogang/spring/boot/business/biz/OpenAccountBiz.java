package com.zhaogang.spring.boot.business.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaogang.spring.boot.business.mapper.OpenAccountMapper;
import com.zhaogang.spring.boot.business.model.OpenAccount;

@Service
public class OpenAccountBiz {

	
	public OpenAccountBiz() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("OpenAccountBiz 初始化："+this);
	}

	@Autowired
	OpenAccountMapper openAccountMapper ;
	
	public OpenAccount queryAccount(Integer id ){
		return openAccountMapper.selectByPrimaryKey(id);
	}
}
