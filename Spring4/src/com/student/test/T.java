package com.student.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.model.Student;
import com.student.service.BankService;
import com.student.service.StudentService;

public class T {
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void add(){
		StudentService studentService = (StudentService) ac.getBean("studentService");
		int addNums = studentService.addStudent(new Student("����",21));
		System.out.println(addNums);
	}
	
	@Test
	public void update(){
		StudentService studentService = (StudentService) ac.getBean("studentService");
		int updateNums = studentService.updateStudent(new Student(4,"����",20));
		System.out.println(updateNums);
	}
	
	@Test
	public void delete(){
		StudentService studentService = (StudentService) ac.getBean("studentService");
		int delectNums = studentService.deleteStudent(5);
		System.out.println(delectNums);
	}
	
	@Test
	public void find(){
		StudentService studentService = (StudentService) ac.getBean("studentService");
		List<Student> studentList = studentService.findStudents();
		for (Student s : studentList){
			System.out.println(s.getName());
		}
	}
	
	@Test
	public void transferAcount(){
		
		BankService bankService = (BankService) ac.getBean("bankService");
		bankService.transferAcounts(500, 1, 2);
	}
}