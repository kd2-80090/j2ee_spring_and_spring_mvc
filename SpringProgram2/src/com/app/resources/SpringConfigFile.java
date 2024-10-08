package com.app.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean("stdObj1")
	public Student createStdBeanObject1() {
		Student std = new Student();
		
		std.setName("Nilesh");
		std.setRollNo(1001);
		std.setEmail("nilesh@gmail.com");
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStdBeanObject2() {
		Student std = new Student();
		
		std.setName("Shubham");
		std.setRollNo(1002);
		std.setEmail("shubham@gmail.com");
		return std;
	}
}
