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
	public User(String userName) {
		super();
		this.userName = userName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	
	
	
	public User(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", safetyQuestion="
				+ safetyQuestion + ", safetyAnswer=" + safetyAnswer + "]";
	}
	
	
	
	
}
