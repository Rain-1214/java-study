package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.student.entity.Student;

public interface StudentService {

	public List<Student> findStudnet();
	
	public int updateStudent(Student student);
	
	public int deleteStudent(Map<String,Object> map);
	
	public int insertStudent(List<Student> student);
	
}
