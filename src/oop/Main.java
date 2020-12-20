package oop;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		
		std1.setName("홍길동");
		std1.setSid("200123");
		std1.addGrade(100);
		std1.addGrade(99);
		std1.addGrade(80);
		std1.addGrade(70);
		
		int[] jumsu = std1.getGrades();
		jumsu[0] = 500;
		System.out.println(Arrays.toString(jumsu));
		
		int[] grades = std1.getGrades();
		System.out.println(Arrays.toString(grades));
		
		System.out.println(std1.getName() + "의 학번 : " + std1.getSid());
	}

}
