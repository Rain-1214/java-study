package com.student.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.student.mappers.StudentMapper;
import com.student.model.Student;
import com.student.util.SqlSessionFactoryUtil;

public class StudentTest3 {
	
	private static Logger logger =Logger.getLogger(StudentTest.class);
	
	private SqlSession sqlSession = null;
	
	private StudentMapper studentMapper = null;

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	
	@Test
	public void testFind(){
		logger.info("查找学生(带地址)");
		Student student = studentMapper.findStudentWithAddress(5);
		System.out.println(student);
	}
	
}
