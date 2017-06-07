package com.netease.course;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	// @Before("execution(* com.netease.course.DemoTest.*(..)) && args(a, ..)")
	// private void DemoDoLogging(JoinPoint jPoint,int a ) {
	// System.out.println(jPoint.toString()+a);

	// }
	@Before("execution(** com.netease.course.Service1.*(..))")
	public void tellMeSomthing() {
		System.out.println("׼������CURD����");
	}

	@AfterReturning("execution(** com.netease.course.Service1.*(..))")
	public void methodSucceed() {
		System.out.println("�����ɹ�");
	}

	@AfterThrowing("execution(** com.netease.course.Service1.*(..))")
	public void methodFail() {
		System.out.println("����ʧ��");
	}
}
