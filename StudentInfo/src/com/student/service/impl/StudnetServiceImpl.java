package com.student.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.Student;
import com.student.service.StudentService;

@Service("studentService")
public class StudnetServiceImpl implements StudentService{
	
	@Resource
	public StudentDao studentDao;
	
	@Override
	public List<Student> findStudnet() {
		return studentDao.findStudent();
	}

	@Override
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public int deleteStudent(Map<String,Object> ids) {
		return studentDao.deleteStudent(ids);
	}

	@Override
	public int insertStudent(List<Student> students) {
		int result = 0;
		for(Student s:students){
			System.out.println(s.getName());
			int number = studentDao.insertStudent(s);
			result += number;
		}
		return result;
	}

}
