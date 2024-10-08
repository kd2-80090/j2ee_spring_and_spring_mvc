package com.app.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.beans.Address;
import com.app.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		
		Address address = new Address();
		
		address.setHouseNo(65);
		address.setCityName("Nagar");
		address.setPincode(414001);
		
		return address;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student student = new Student();
		
		student.setName("Shubham");
		student.setRollNo(18);
		student.setMarks(65.42);
//		student.setAddress(createAddressObj());	//Manual DI

		return student;
	}
}
