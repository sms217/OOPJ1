package oopv2;

import java.util.Arrays;

public class Person {//»ó¼Ósuper class, parent class
	private String name;
	private String sid;
	private String phone;
	private String gender;
	private String dept;
	
	public void print() {
		System.out.println("name : " + name + ", phone : " + phone + ", dept : " + dept );
	}
	
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

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
}
