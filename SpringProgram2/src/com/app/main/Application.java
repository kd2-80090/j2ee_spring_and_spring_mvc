
package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.Student;
import com.app.resources.SpringConfigFile;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
//		Student std = (Student) context.getBean("stdId1");
//		
//		std.display();
		
//		Student std = (Student) context.getBean("stdObj");
//		
//		std.display();
		
//		Student std = context.getBean(Student.class);
//		
//		std.display();
		
		Student std1 = (Student) context.getBean("stdObj1");
		
		std1.display();
		
		System.out.println("-------------------");
		
		Student std2 = (Student) context.getBean("stdObj2");
		
		std2.display();
	}
}
