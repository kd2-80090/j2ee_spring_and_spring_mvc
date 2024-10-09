package com.app.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setRollNo(rs.getInt("std_roll"));
		student.setName(rs.getString("std_name"));
		student.setMarks(rs.getDouble("std_marks"));
		return student;
	}

}
