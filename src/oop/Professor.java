package oop;

import java.util.Arrays;

public class Professor {//sub class, child class
/*
 * name : string*/
	private String name;
	private String sid;
	private String phone;
	private String gender;
	private String dept;
	private String[] lectures;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String[] getLectures() {
		return lectures;
	}
	public void setLectures(String[] lectures) {
		this.lectures = lectures;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void print() {
		System.out.println("name : " + name + ", sid : " + sid + ", phone : " + phone +
				"dept : " + dept + ", lectures : " + Arrays.toString(lectures) );
	}
}

