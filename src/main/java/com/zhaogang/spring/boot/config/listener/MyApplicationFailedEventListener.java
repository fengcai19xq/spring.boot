package com.zhaogang.spring.boot.config.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
/**
 * spring boot启动异常时执行事件 
 * @author qian.xu
 *
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent>{

	public void onApplicationEvent(ApplicationFailedEvent event) {
		// TODO Auto-generated method stub
		 Throwable throwable = event.getException();
	        handleThrowable(throwable);
	}
	 /*处理异常*/
    private void handleThrowable(Throwable throwable) {
    }

}
