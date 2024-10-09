package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Application {

	public static void main(String[] args) {
				
		String fileLocation = "/com/app/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(fileLocation);		
				
		Student student = (Student) context.getBean("stdId");
		
		student.display();
	}
}
