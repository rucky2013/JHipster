package com.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;

public class UserData {
	
    private String name;
    private int age;
    
	public UserData(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
}
