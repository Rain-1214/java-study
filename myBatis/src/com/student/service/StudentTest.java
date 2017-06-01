package com.student.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.student.mappers.StudentMapper;
import com.student.model.Student;
import com.student.util.SqlSessionFactoryUtil;

public class StudentTest {
	
	private static Logger logger =Logger.getLogger(StudentTest.class);

	public static void main(String[] args) {
		
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		int result = studentMapper.add(new Student("����",20));
		sqlSession.commit();
		logger.info("���ӳɹ�");
		System.out.println(result);
	}
	
}