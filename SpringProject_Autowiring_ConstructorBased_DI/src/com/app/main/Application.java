package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.Student;
import com.app.resources.SpringConfigFile;

public class Application {

	public static void main(String[] args) {
				
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student student = context.getBean(Student.class);
		
		student.display();
	}
}
