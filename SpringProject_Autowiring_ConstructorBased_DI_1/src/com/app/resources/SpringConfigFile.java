package com.app.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.beans.Address;
import com.app.beans.Student;
import com.app.beans.Subject;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		
		Address address = new Address(10005,"Sangamne",414001);
		
		return address;
	}
	
	@Bean
	public Subject createSubjectObj() {
		
		Subject subjects = new Subject();
		
		List<String> subject_list = new ArrayList<String>();
		
		subject_list.add("Maths");
		subject_list.add("Science");
		subject_list.add("Biology");
		
		subjects.setSubjects(subject_list);
		
		return subjects;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student student = new Student();

		student.setName("Nilesh");
		student.setRollNo(108);
		student.setMarks(95.00);
//		student.setAddress(createAddressObj());
//		student.setSubjects(createSubjectObj());
		return student;
	}
}
