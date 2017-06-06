package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//		
//		Header header = context.getBean("header", StraightHeader.class);
//		Header header2=context.getBean(Header.class,new Header() {
//			
//			public String getInfo() {
//				// TODO Auto-generated method stub
//				return "我是通过这个方法实现的";
//			}
//			
//			public void doWork() {
//				System.out.println("我的方法");
//				
//			}
//		});
//		System.out.println("2222");
//		header2.doWork();
//		
//		ScrewDriver screwDriver = context.getBean("screwDriver", ScrewDriver.class);
//		screwDriver.use();
//		
//		((ConfigurableApplicationContext) context).close();
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Homeworke homeworke=context.getBean("homeworke", Homeworke.class);
		homeworke.write("abcdefg");
		((ConfigurableApplicationContext)context).close();
	}
}
