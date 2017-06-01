package com.student.mappers;

import java.util.List;

import com.student.model.Student;

public interface StudentMapper {
	
	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student findById(int id);
	
	public List<Student> find();
	
	public Student findStudentWithAddress(int id);
	
	public Student findByGradeId(int gradeId);
	
}