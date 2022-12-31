package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student  implements IStudent{

	public String getDailyWorkOut() {
		
		return "Roj Cricket 2hr ";
	}

}
