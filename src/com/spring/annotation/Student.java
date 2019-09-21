package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	public Student() {
		System.out.println("Invoking class "+this.getClass().getSimpleName());
	}
	int no;
	String name;
	public int getNo() {
		return no;
	}
	@Value("123")
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	@Value("Saravanan")
	public void setName(String name) {
		this.name = name;
	}
	
	
}
