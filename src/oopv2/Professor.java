package oopv2;

import java.util.Arrays;

public class Professor extends Person {
	private String[] lectures; // Professor 클래스 안에서 쓸 수 있는 전역변수로 지정
	
	public void print() {
		String lec = "없음";
		if(lectures != null) {
			lec = "";
			for(int i = 0; i < lectures.length; i++) {
				lec += (lectures[i] + " ");
			}
		}
		
			System.out.println("name" + getName() + "phone" +  getPhone() +"dept" + getDept()+ "lecture"+lec);
	}
	public String[] getLectures() {
		if(lectures == null) {
			return null;
		}
		
		String[] copy = Arrays.copyOf(lectures, lectures.length);
		return copy;
	}
	public void setLectures(String[] lectures) {
		this.lectures = new String[lectures.length];
		for(int i = 0; i<lectures.length; i++) {
			this.lectures[i] = lectures[i];
		}
	}

}
