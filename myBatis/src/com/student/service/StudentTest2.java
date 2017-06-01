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

public class StudentTest2 {
	
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
	public void testAdd() {
		logger.info("添加学生");
		int result = studentMapper.add(new Student("王五",23));
		sqlSession.commit();
	}
	
	@Test
	public void testUpdate(){
		logger.info("修改学生");
		int result = studentMapper.update(new Student(3,"李四2",22));
		sqlSession.commit();
		System.out.println(result);
	}
	
	@Test
	public void testDelete(){
		logger.info("删除学生");
		int result = studentMapper.delete(4);
		sqlSession.commit();
		System.out.println(result);
	}

	@Test
	public void testFindById(){
		logger.info("查找ID");
		Student student = studentMapper.findById(3);
		System.out.println(student.getName());
	}
	
	@Test
	public void testFind(){
		logger.info("查找所有学生");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s.getName());
		}
	}
	
	@Test
	public void testFindWithGrade(){
		logger.info("查找所有学生(带年级)");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
}
