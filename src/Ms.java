import java.util.*;
public class Ms {

	public static void main(String[] args) {//practiceOddEven ();
	//practicePlus();
	//bonus ();
	//star();
	//beak ();
	//sm ();
	//av ();
	//tC();
	//game();
	//game2()
		ary ();
		// TODO Auto-generated method stub
		/*System.out.println("���� �� ���� �Է��Ͻÿ�.");
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       System.out.println(a + "+" + b + "=" + (a+b));
       System.out.println(a + "-" + b + "=" + (a-b));
       System.out.println(a + "x" + b + "=" + (a*b));
       System.out.println(a + "/" + b + "=" + (a/b));
       System.out.println(a + "%" + b + "=" + (a%b));
	}*/}
	private static void practiceOddEven () {
		
		System.out.println("������ �Է��ϼ���.");
		
		Scanner input =new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n%2 == 0) {
			
		   System.out.println(n + "�� ¦���Դϴ�.");
		
		} else
			
		  System.out.println(n + "Ȧ�� �Դϴ�.");
		}
	
	private static void practicePlus() {
		System.out.println("������ �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
	
		if (a > 0) {
			System.out.println("����Դϴ�.");
		}
		else if(a==0) {
			System.out.println("0�Դϴ�.");
		}
		else if(a < 0) {
			System.out.println("�����Դϴ�.");
	}
	}
	private static void bonus () {
		final int a = 1000;
		System.out.println("������ �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		if(l > a) {
		System.out.println("���� �޼�");
		System.out.println("���ʽ�  = " + 0.1 * l);
		} else if(l == a) {
			System.out.println("���� �޼�" + "\n���ʽ� = 0");
		} else if(l < a) {
			System.out.println("���� �̴޼�");
		}
	}
	private static void star() {
		System.out.println("������ �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= (n-1-i))System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	private static void beak () {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int count = 0;
		while(true) {
			
			System.out.print("������ �Է��Ͻÿ�[���� : -1�� �Է�]"+"\n");
			int grade = scan.nextInt();
			
			if(grade < 0) {
				System.out.println("���� �Է��� ��Ĩ�ϴ�.");
				break;
			}
			total += grade;
			count++;
		}
		System.out.println("�����" + (total/count));
	}
	private static void sm () {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("���� ���ڿ� �� ���ڸ� �Է��Ͻÿ�.");
		int start = input.nextInt();
		int end = input.nextInt();
		
		while(start <= end) {
			sum = sum + start;
			start++;		
		}
		System.out.print(sum);
	}
	private static void av () {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int count = 0;
		while(true) {
			
			System.out.print("������ �Է��ϼ���. -1�� ġ�� ���ݱ����� ����� ���մϴ�.");
			int grade = scan.nextInt();
			
			if (grade < 0) {
				System.out.println("����� ���߽��ϴ�");
				break;
			}
		total += grade;
		count++;
		}
		System.out.println("��� - " + total/count);
		scan.close();
	}
	private static void tC() {
		System.out.println("Make a sentence.");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			
		
			if(s.charAt(i) =='n') {
				count++;
			}	
			

		}
	
	System.out.println("���忡�� �߰ߵ� ���� n�� ���� = " + count);
	}
	
	private static void  game() {
	
		Random random = new Random(System.currentTimeMillis());
		
		final int a = random.nextInt(1000) + 1;
	 	Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0;
		
		while(i != a) {
			System.out.println("���ڸ� ����������.");
			i = scan.nextInt();
			
			if(i < a) {
				System.out.println("�װź��ٴ� Ŀ��^^");		
			}else if (i > a) {
				System.out.println("�װź��ٴ� �۾ƿ�^^");
			}
			count++;
			}
			
			System.out.println(count + "������ ���߼̳׿� ����");
			scan.close();
	}	
	private static void game2() {
		
		Random random = new Random(System.currentTimeMillis());
		
		final int a = random.nextInt(1000) + 1;
	 	Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0;
		
			do {
			System.out.println("���ڸ� ����������.");
			i = scan.nextInt();
			
			if(i < a) {
				System.out.println("�װź��ٴ� Ŀ��^^");		
			} else if (i > a) {
				System.out.println("�װź��ٴ� �۾ƿ�^^");
			}
			count++;
			
			} while(i != a);
			
			System.out.println(count + "������ ���߼̳׿� ����");
			scan.close();
	}
	private static void ary () {
		String [] topping = {"Sausage", "Bacon","Egg", "Mushroom", "Onion", "Lettuce"};
		for (int i = 0; i < topping.length; i++) {
		System.out.print(topping[i] + "-");
		}
	}
}
