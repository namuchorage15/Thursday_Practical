package com.studentjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs,int rowno)throws SQLException{
		Student stu=new Student();
		stu.setId(rs.getInt(1));
		stu.setName(rs.getString(2));
		stu.setGender(rs.getString(3));
        return stu;	
	}
}
