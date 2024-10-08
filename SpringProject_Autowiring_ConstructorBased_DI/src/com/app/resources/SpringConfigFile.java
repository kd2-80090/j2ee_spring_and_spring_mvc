package com.app.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.beans.Address;
import com.app.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		
		Address address = new Address(10005,"Sangamne",414001);
		
		return address;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student student = new Student("Shubham",956,79.81,createAddressObj());

		return student;
	}
}
