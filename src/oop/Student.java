package oop;
/*�ؾߵ� ��
 * ���,����,�ְ� ������ ĸ��ȭ��Ű��(������Ƽ�� ���� ��ɵ��� ���赵,Ŭ�����ȿ� ����� �ֱ�)
 * 
 * �й��� ���ڷθ� �ޱ�
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
 }//�޼ҵ� �����ε� ������ �̸��� �޼ҵ带 ������ ������ �� �ִ�. �Ű������ ����, ������Ÿ��, ������ �޶���Ѵ�.
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
