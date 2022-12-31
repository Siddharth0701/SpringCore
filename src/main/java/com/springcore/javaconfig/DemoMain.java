package com.springcore.javaconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		Student student = context.getBean("firststudent",Student.class);
		 String s1=student.getDailyWorkOut();
		System.out.println(s1);
		context.close();

	}

}
