package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("Bean count "+context.getBeanDefinitionCount());
		Student st = context.getBean(Student.class);
		System.out.println(st);
	}

}
