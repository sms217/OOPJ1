package oopv2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("person");
		Student std1 = new Student();
		std1.setName("student");
		std1.setDept("����");
		std1.setGender("����");
		std1.setPhone("010-5105-3000");
//		std1.addGrade(100);
		std1.print();
		System.out.println(std1);
		System.out.println(std1.toString());
		Professor prof1 = new Professor();
		prof1.setName("professor");
		prof1.setDept("����");
		prof1.setGender("����");
		prof1.setPhone("010-5105-3000");
		prof1.setLectures(new String[] {"���α׷��ֱ���","�����α׷���"});
		prof1.print();
		
		person.print();
		std1.print();
		person = std1;
		person.print();
		
		GraduatedStudent std3 = new GraduatedStudent();
		std3.setMajor("����");
		System.out.println(std3.getMajor());
		
		Person[] pArr = new Student[3];
		pArr[0] = new Person();
		pArr[0].setName("�Ͽ���");
		pArr[1] = new Person();
		pArr[1].setName("gg");
		pArr[2] = new Person();
		pArr[2].setName("�Ͽ���gg");
		print(pArr);
		
		Person[] sarr = new Student[3];
		pArr[0] = new Person();
		pArr[0].setName("ff");
		pArr[1] = new Person();
		pArr[1].setName("fff");
		pArr[2] = new Person();
		pArr[2].setName("ffff");
		print(pArr);
	}
		
		public static void print(Person[] parr) {
			System.out.println("**");
			for(int i = 0; i < parr.length; i++) {
				parr[i].print();
				if(parr[i] instanceof Student) {
					((Student)parr[i]).test();
				}
			}
		}
		public static void print(Student[] sarr) {
			for(int i = 0; i < sarr.length; i++) {
				sarr[i].print();
	}

}
}
