package com.netease.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(initMethod = "init", destroyMethod = "destory")
	public Homeworke homeworke() {
		return new Homeworke();

	}
}
