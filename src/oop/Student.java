package oop;
/*해야될 거
 * 평균,최저,최고 점수를 캡슐화시키기(프로퍼티와 그의 기능들을 설계도,클래스안에 만들어 주기)
 * 
 * 학번을 숫자로만 받기
 * */

public class Student {//sub class, child class
 private String name;
 private String sid;
 private String phone;
 private String gender;
 private String dept;
 private int sLevel;
 private int[] grades = new int[10];
 private int idx = 0;
 
 public int add(int n1, int n2) {
	 return n1+n2;
 }
 
 public double add(double n1, double n2) {
	 return n1+n2;
 }//메소드 오버로딩 동일한 이름의 메소드를 여러개 선언할 수 있다. 매개면수의 수나, 데이터타입, 순서가 달라야한다.
 public void addGrade(int jumsu) {
	 grades[idx++] = jumsu;
 }
 
 public int maxgrade(){
	 int max = grades[0];
	 return max;	 
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

public int[] getGrades() {
	return grades;
}

public void setGrades(int[] grades) {
	this.grades = grades;
}
}
