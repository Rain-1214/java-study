package com.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class People {
	private String name;
	private int age;
	private int id;
	private Dog dog;
	private List<String> hobbies = new ArrayList<String>();
	private Set<String> loves = new HashSet<String>();
	private Map<String,String> works = new HashMap<String,String>();
	private Properties addresses = new Properties();
	
	
	public Set<String> getLoves() {
		return loves;
	}
	public Map<String, String> getWorks() {
		return works;
	}
	public void setWorks(Map<String, String> works) {
		this.works = works;
	}
	public void setLoves(Set<String> loves) {
		this.loves = loves;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public Properties getAddresses() {
		return addresses;
	}
	public void setAddresses(Properties addresses) {
		this.addresses = addresses;
	}
	public People() {
		super();
	}
	
	public People(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", id=" + id + ", dog=" + dog + ", hobbies=" + hobbies
				+ ", loves=" + loves + ", works=" + works + ", addresses=" + addresses + "]";
	}
	
	
	
	
}