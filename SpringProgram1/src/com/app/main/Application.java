package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Application {

	public static void main(String[] args) {
		String configLocation = "/com/app/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std1 = (Student) context.getBean("stdId2");
		std1.display();
		
		System.out.println("------------------");
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
	}
}


// 1. spring-beans-xxx.jar version
// 2. spring core
//		context 
//		commons logging
//		expression