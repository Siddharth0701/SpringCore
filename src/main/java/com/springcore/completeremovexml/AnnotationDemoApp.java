package com.springcore.completeremovexml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring java config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		
		//get bean form spring container
		StudentConfig student = context.getBean("firststudent",StudentConfig.class);
		 String s1=student.getDailyWorkOut();
		System.out.println(s1);
		context.close();
		
		
	}

}
