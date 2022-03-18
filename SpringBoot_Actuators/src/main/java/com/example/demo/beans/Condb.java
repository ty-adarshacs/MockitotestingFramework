package com.example.demo.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mysore")
public class Condb {
	
//	mysore.name=maharaja
//			mysore.age=23
//			mysore.place=kuvempu
	
	String name;
	String age;
	String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
  public	void setAge(String age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
public	void setPlace(String place) {
		this.place = place;
	}
	
	

}
