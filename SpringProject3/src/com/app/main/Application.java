package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Application {

	public static void main(String[] args) {
		
		String configLocation = "/com/app/resources/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
	
		Student std1 = (Student) context.getBean("student");
		
//		std1.setName("Nilesh");
//		std1.setRollNo(1001);
//		std1.setEmail("nilesh@gmail.com");
		std1.display();
		
		System.out.println("----------------");
		
		Student std2 = (Student) context.getBean("student");
		
		std1.setName("Shubham");
		std1.setRollNo(1002);
		std1.setEmail("shubham@gmail.com");
		std2.display();
		
	}
}
