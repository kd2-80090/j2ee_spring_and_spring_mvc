package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.Student;
import com.app.resources.SpringConfigFile;

public class Application {

	public static void main(String[] args) {
				
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
		Student std1 = (Student) context.getBean("student");
		
//		std1.setName("Nilesh");
//		std1.setRollNo(1001);
//		std1.setEmail("nilesh@gmail.com");
		std1.display();
		
		System.out.println("----------------");
		
		Student std2 = (Student) context.getBean("student");
		
		std1.setName("Rohit");
		std1.setRollNo(1005);
		std1.setEmail("rohit@gmail.com");
		std2.display();
		
	}
}
