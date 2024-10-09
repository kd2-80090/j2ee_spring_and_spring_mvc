package com.app.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.Student;
import com.app.mappers.StudentRowMapper;
import com.app.resources.SpringConfigFile;

public class Application {

	public static void main(String[] args) {
				
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		
//		---------------------INSERT OPERATION----------------------
//		
//		int std_rollno = 101;
//		String std_name = "Amit Dhotre";
//		float std_marks = 90.23f;
//		String insertSqlQuery = "INSERT INTO STUDENT values(?,?,?)";
//		int count = jdbcTemplate.update(insertSqlQuery,std_rollno,std_name,std_marks);
//		
//		if(count > 0) {
//			System.out.println("Success : 1 Row Affected");
//		}
//		else {
//			System.out.println("Error : While executing query");
//		}
		
		//-------------------UPDATE OPERATION -------------------
		
//		int std_rollno = 101;
//		float std_marks = 60.23f;
//		
//		String updateSqlQuery = "UPDATE student SET std_marks = ? where std_roll = ?";
//		int count = jdbcTemplate.update(updateSqlQuery,std_marks,std_rollno);
//		
//		if(count > 0) {
//			System.out.println("Success : 1 Row Affected");
//		}
//		else {
//			System.out.println("Error : While executing query");
//		}
		
		//-------------------DELETE OPERATION ---------------------
		
//		int rollno = 105;
//		
//		String deleteSqlQuery = "DELETE from student where std_roll = ?";
//		int count = jdbcTemplate.update(deleteSqlQuery,rollno);
//		
//		if(count > 0) {
//			System.out.println("Success : 1 Row Affected");
//		}
//		else {
//			System.out.println("Error : While executing query");
//		}
		
		//------------------ SELECT OPERATION 1---------------------
		
//		String selecySqlQuery = "SELECT * from student";
//		List<Student> students =jdbcTemplate.query(selecySqlQuery, new StudentRowMapper());
//		
//		for (Student student : students) {
//			System.out.println("Roll No : " + student.getRollNo());
//			System.out.println("Name : " + student.getName());
//			System.out.println("Marks : " + student.getMarks());
//			System.out.println("------------------------------------- ");
//		}
		
		//------------------ SELECT OPERATION 2---------------------
		
//		int rollNo = 101;
//		String selecySqlQuery = "SELECT * from student where std_roll = ?";
//		List<Student> students =jdbcTemplate.query(selecySqlQuery, new StudentRowMapper(),rollNo);
//		
//		for (Student student : students) {
//			System.out.println("Roll No : " + student.getRollNo());
//			System.out.println("Name : " + student.getName());
//			System.out.println("Marks : " + student.getMarks());
//			System.out.println("------------------------------------- ");
//		}
	
		//------------------ SELECT OPERATION 3---------------------
		
		int rollNo = 104;
		String selecySqlQuery = "SELECT * from student where std_roll = ?";
		Student student =jdbcTemplate.queryForObject(selecySqlQuery, new StudentRowMapper(),rollNo);
		
		System.out.println("Roll No : " + student.getRollNo());
		System.out.println("Name : " + student.getName());
		System.out.println("Marks : " + student.getMarks());			
		System.out.println("------------------------------------- ");
	
	}
	
	
	
}
