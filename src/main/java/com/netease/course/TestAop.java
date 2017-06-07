package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		//DemoTest demoTest = context.getBean(DemoTest.class);
		//System.out.println(demoTest.add(2, 4));
//		Student student1=new Student("Tom","24","on");
//		Student student2=new Student("Jack","21","on");
//		Student student3=new Student("LiLi","18","on");
//		Student student4=new Student("Jun","64","on");
//		Student student5=new Student("Lucky","24","on");
//		Student[] students={student1,student2,student3,student4,student5};
		Service1 service1=context.getBean(Service1.class);
		//service1.add("tom", "21", "on");
		//service1.printName();
//		service1.query("Jack");
		//service1.update("Jack", "0");
		service1.query("Jack");
		((ConfigurableApplicationContext) context).close();
	}

}
