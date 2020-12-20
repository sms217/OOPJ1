package oopv2;

public class Student extends Person {
	private int[] grades = new int[10];
	private int idx = 0;
	
	
	public void print() {
		System.out.println("name:" + getName() + "phone" + getPhone() + "sid" + getSid() + "dept" + getDept() + "average" + getAverage());
	}

	private int[] getGrades() {
		int[] copy = arrayCopy(grades, idx);
		return copy;
	}
	public double getAverage() {
		double result = 0;
		int sum = 0;
		for(int i = 0; i<idx; i++)
				sum+=grades[i];
		result = (double)sum/idx;
		return result;
	}
	private int[] arrayCopy(int[] org, int length) {
		int[]copy = new int[length];
		for(int i = 0; i<org.length; i++) {
			copy[i] = grades[i]; 
		}
		return copy;
	}
	//Overriding �޼ҵ带 ������ �Ѵ�.
	public String toString() { //������ �������� ����ϴ� toString�޼ҵ带 ����������.
		String a = "hi";
		return a;
	}
	public String test() {
		String a= "test";
		return a;
	}
}
