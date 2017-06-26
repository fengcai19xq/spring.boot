package com.zhaogang.spring.boot.config.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 上下文创建完成后执行的事件监听器
 * @author qian.xu
 * 在获取完上下文后，可以将上下文传递出去做一些额外的操作。
  *在该监听器中是无法获取自定义bean并进行操作的。
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent>{

	public void onApplicationEvent(ApplicationPreparedEvent event) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext cac = event.getApplicationContext();
	}

}
