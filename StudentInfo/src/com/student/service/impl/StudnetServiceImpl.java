package com.student.service.impl;

import java.util.List;

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
	
}