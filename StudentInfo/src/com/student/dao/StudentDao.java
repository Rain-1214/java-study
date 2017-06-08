package com.student.dao;

import java.util.List;
import java.util.Map;

import com.student.entity.Student;

public interface StudentDao {
	
	public List<Student> findStudent();
	
	public int updateStudent(Student student);
	
	public int deleteStudent(Map<String,Object> map);
	
	public int insertStudent(Student student);
	
}
