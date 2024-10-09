package com.app.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.app.beans.Student;
import com.app.mappers.StudentRowMapper;
import com.app.resources.SpringConfigFile;

public class Application {

	public static void main(String[] args) {
				
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("key_rollno", 106);
		map.put("key_name", "Raghav");
		map.put("key_marks", 88.00);
		
		String insertSqlQuery = "INSERT into student VALUES (:key_rollno,:key_name,:key_marks)";
		
		int count = npJdbcTemplate.update(insertSqlQuery, map);
		
		if(count > 0) {
			System.out.println("Success : 1 Row Affected");
		}
		else {
			System.out.println("Error : While Adding Data");
		}
	}
	
	
	
}
