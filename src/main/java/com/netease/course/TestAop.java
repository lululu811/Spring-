package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		DemoTest demoTest=context.getBean(DemoTest.class);
		System.out.println(demoTest.add(2, 4));
		((ConfigurableApplicationContext)context).close();
	}

}
