package com.example.convertion.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_new")
public class User
{
	@Id
	private long id;
	private String name;
	private int age;
	private String city;
	private String gender;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String name, int age, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
