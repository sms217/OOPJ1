package oop;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor();
		
		prof1.setName("ȫ���");
		prof1.setGender("����");
		prof1.setDept("����");
		prof1.setPhone("010-5455-1212");
		prof1.setLectures(new String[] {"���α׷��ֱ���", "�����α׷���(I)"});
		//System.out.print(name gender dept lectures);
		prof1.print();
		
		Professor prof2 = new Professor();
		
		prof2.setName("ȫ���");
		prof2.setGender("����");
		prof2.setDept("����");
		prof2.setPhone("010-5511-1612");
		prof2.setLectures(new String[] {"��ǻ�ͳ�Ʈ��ũ", "�����ͺ��̽�����"});
		prof2.print();
	}
	
	

}
