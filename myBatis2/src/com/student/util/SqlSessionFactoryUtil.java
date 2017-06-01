package com.student.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {

	private static SqlSessionFactory sqlSessionFactory;
	
	private static SqlSessionFactory getSqlSessionFactory(){
		
		if(sqlSessionFactory == null){
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return sqlSessionFactory;
		
	}
	
	public static SqlSession openSession(){
		return getSqlSessionFactory().openSession();
	}
	
	
}
