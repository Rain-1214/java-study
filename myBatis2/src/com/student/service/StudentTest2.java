package com.student.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.student.mappers.StudentMapper;
import com.student.model.Student;
import com.student.util.SqlSessionFactoryUtil;

public class StudentTest2 {
	
	private static Logger logger =Logger.getLogger(StudentTest2.class);
	
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
	public void testSearch() {
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("age", 22);
		List<Student> studentList = studentMapper.searchStudents(map);
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
	@Test
	public void testSearch2() {
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("searchBy", "name");
		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("age", 22);
		List<Student> studentList = studentMapper.searchStudents2(map);
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
	@Test
	public void testSearch3() {
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("gradeId", 2);
		map.put("name", "%李%");
//		map.put("age", 22);
		List<Student> studentList = studentMapper.searchStudents3(map);
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
	@Test
	public void testSearch4() {
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("age", 22);
		List<Student> studentList = studentMapper.searchStudents4(map);
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
	@Test
	public void testSearch5() {
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(1);
//		gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		List<Student> studentList = studentMapper.searchStudents5(map);
		for(Student s:studentList){
			System.out.println(s);
		}
	}

	@Test
	public void testSearch6() {
		logger.info("查询学生");
		List<Student> studentList = studentMapper.searchStudents6("%李%",22);
		for(Student s:studentList){
			System.out.println(s);
		}
	}
	
	@Test
	public void testUpdateStudent(){
		logger.info("更新学生");
		Student student = new Student();
		student.setId(5);
		student.setName("赵柳222");
//		student.setAge(20);
		int result = studentMapper.updateStudent(student); 
		sqlSession.commit();
		System.out.println(result);
		
	}
	
	@Test
	public void testfind(){
		logger.info("查询学生");
		int offset=0,limit = 3;
		RowBounds rowBounds = new RowBounds(offset,limit);
		List<Student> result = studentMapper.findStudents(rowBounds); 
		for(Student s:result){
			System.out.println(s);
		}
	}
	
	@Test
	public void testfind2(){
		logger.info("查询学生");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start", 0);
		map.put("size", 3);
		List<Student> result = studentMapper.findStudents2(map); 
		for(Student s:result){
			System.out.println(s);
		}
	}
	
	
	
}
