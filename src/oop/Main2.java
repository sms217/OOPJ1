package oop;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor();
		
		prof1.setName("홍길등");
		prof1.setGender("남자");
		prof1.setDept("컴정");
		prof1.setPhone("010-5455-1212");
		prof1.setLectures(new String[] {"프로그래밍기초", "웹프로그래밍(I)"});
		//System.out.print(name gender dept lectures);
		prof1.print();
		
		Professor prof2 = new Professor();
		
		prof2.setName("홍길댕");
		prof2.setGender("여자");
		prof2.setDept("컴정");
		prof2.setPhone("010-5511-1612");
		prof2.setLectures(new String[] {"컴퓨터네트워크", "데이터베이스기초"});
		prof2.print();
	}
	
	

}
