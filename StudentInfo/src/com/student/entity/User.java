package com.student.entity;

public class User {
	
	private Integer id;
	private String userName;
	private String password;
	private String safetyQuestion;
	private String safetyAnswer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSafetyQuestion() {
		return safetyQuestion;
	}
	public void setSafetyQuestion(String safetyQuestion) {
		this.safetyQuestion = safetyQuestion;
	}
	public String getSafetyAnswer() {
		return safetyAnswer;
	}
	public void setSafetyAnswer(String safetyAnswer) {
		this.safetyAnswer = safetyAnswer;
	}
	
	
	
	
}
