package com.zhaogang.spring.boot.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import com.zhaogang.config.service.init.InitContextLoaderListener;
/**
 * spring boot 启动监听类
 * @author qian.xu
 *
 */
public class MyApplicationStartListener implements  ApplicationListener<ApplicationStartedEvent>{
	private static Logger logger = LoggerFactory.getLogger(MyApplicationStartListener.class);

	public void onApplicationEvent(ApplicationStartedEvent event) {
		// TODO Auto-generated method stub
		try {
			new InitContextLoaderListener();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("加载配置中心异常",e);
		}
	}
}
