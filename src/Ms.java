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
		/*System.out.println("정수 두 개를 입력하시오.");
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
		
		System.out.println("정수를 입력하세요.");
		
		Scanner input =new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n%2 == 0) {
			
		   System.out.println(n + "은 짝수입니다.");
		
		} else
			
		  System.out.println(n + "홀수 입니다.");
		}
	
	private static void practicePlus() {
		System.out.println("정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
	
		if (a > 0) {
			System.out.println("양수입니다.");
		}
		else if(a==0) {
			System.out.println("0입니다.");
		}
		else if(a < 0) {
			System.out.println("음수입니다.");
	}
	}
	private static void bonus () {
		final int a = 1000;
		System.out.println("실적을 입력하세요.");
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		if(l > a) {
		System.out.println("실적 달성");
		System.out.println("보너스  = " + 0.1 * l);
		} else if(l == a) {
			System.out.println("실적 달성" + "\n보너스 = 0");
		} else if(l < a) {
			System.out.println("실적 미달성");
		}
	}
	private static void star() {
		System.out.println("정수를 입력하세요.");
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
			
			System.out.print("정수를 입력하시오[종료 : -1을 입력]"+"\n");
			int grade = scan.nextInt();
			
			if(grade < 0) {
				System.out.println("점수 입력을 마칩니다.");
				break;
			}
			total += grade;
			count++;
		}
		System.out.println("평균은" + (total/count));
	}
	private static void sm () {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("시작 숫자와 끝 숫자를 입력하시오.");
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
			
			System.out.print("점수를 입력하세요. -1을 치면 지금까지의 평균을 구합니다.");
			int grade = scan.nextInt();
			
			if (grade < 0) {
				System.out.println("평균을 구했습니다");
				break;
			}
		total += grade;
		count++;
		}
		System.out.println("평균 - " + total/count);
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
	
	System.out.println("문장에서 발견된 문자 n의 개수 = " + count);
	}
	
	private static void  game() {
	
		Random random = new Random(System.currentTimeMillis());
		
		final int a = random.nextInt(1000) + 1;
	 	Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0;
		
		while(i != a) {
			System.out.println("숫자를 맞혀보세요.");
			i = scan.nextInt();
			
			if(i < a) {
				System.out.println("그거보다는 커요^^");		
			}else if (i > a) {
				System.out.println("그거보다는 작아요^^");
			}
			count++;
			}
			
			System.out.println(count + "번만에 맞추셨네요 ㅎㅎ");
			scan.close();
	}	
	private static void game2() {
		
		Random random = new Random(System.currentTimeMillis());
		
		final int a = random.nextInt(1000) + 1;
	 	Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0;
		
			do {
			System.out.println("숫자를 맞혀보세요.");
			i = scan.nextInt();
			
			if(i < a) {
				System.out.println("그거보다는 커요^^");		
			} else if (i > a) {
				System.out.println("그거보다는 작아요^^");
			}
			count++;
			
			} while(i != a);
			
			System.out.println(count + "번만에 맞추셨네요 ㅎㅎ");
			scan.close();
	}
	private static void ary () {
		String [] topping = {"Sausage", "Bacon","Egg", "Mushroom", "Onion", "Lettuce"};
		for (int i = 0; i < topping.length; i++) {
		System.out.print(topping[i] + "-");
		}
	}
}
