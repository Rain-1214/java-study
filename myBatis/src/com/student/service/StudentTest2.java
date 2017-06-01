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
		logger.info("����ѧ��");
		int result = studentMapper.add(new Student("����",23));
		sqlSession.commit();
	}
	
	@Test
	public void testUpdate(){
		logger.info("�޸�ѧ��");
		int result = studentMapper.update(new Student(3,"����2",22));
		sqlSession.commit();
		System.out.println(result);
	}
	
	@Test
	public void testDelete(){
		logger.info("ɾ��ѧ��");
		int result = studentMapper.delete(4);
		sqlSession.commit();
		System.out.println(result);
	}

	@Test
	public void testFindById(){
		logger.info("����ID");
		Student student = studentMapper.findById(3);
		System.out.println(student.getName());
	}
	
	@Test
	public void testFind(){
		logger.info("��������ѧ��");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s.getName());
		}
	}
	
	@Test
	public void testFindWithGrade(){
		logger.info("��������ѧ��(���꼶)");
		List<Student> studentList = studentMapper.find();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
}