package com.studentjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	private JdbcTemplate jdbctemp;
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp=jdbctemp;
	}
	public int saveStudent(Student s) {
		String query="insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getGender()+"')";
				return jdbctemp.update(query);
		}
	public int updateStudent(Student s) {
		String query="update student set name='" +s.getName()+"',salary='"+s.getGender()+"'where id='"+s.getId()+"'";
        return jdbctemp.update(query);	
	}
	public int deleteStudent(Student s) {
		String query="delete from students where id='" +s.getId()+"'";
        return jdbctemp.update(query);	
	}
	public List<Student> viewStudent(){
		String query1="select * from student";
		List<Student> stu=jdbctemp.query(query1, new StudentMapper());
		return stu ;
	}
	
	
}



