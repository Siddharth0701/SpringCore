package com.springcore.completeremovexml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.springcore.completeremovexml")
@Component("firststudent")
public class StudentConfig implements IStudent{

	public String getDailyWorkOut() {
		
		return "Hello Siddharth Singh";
	}

}
