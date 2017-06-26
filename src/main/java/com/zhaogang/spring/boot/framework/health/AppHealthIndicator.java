package com.zhaogang.spring.boot.framework.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
/**
 * Spring Boot 默认提供了对应用本身、关系数据库连接、MongoDB、Redis 和 Rabbit MQ 的健康状态的检测功能。
 * 当应用中添加了 DataSource 类型的 bean 时，Spring Boot 会自动在 health 服务中暴露数据库连接的信息
 * @author qian.xu
 *
 */
@Component
public class AppHealthIndicator implements HealthIndicator{

	public Health health() {
		// TODO Auto-generated method stub
		return Health.up().build();
	}

}
