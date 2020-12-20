import java.util.*;
public class Time {

	public static void main(String[] args) {
//		theNested ();
		/*// TODO Auto-generated method stub
		int i=0;
		int j=0;
		for(i=0; i<5; i++) {
			for(j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println("")
		}*/
	}
	private static void theNested () {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		for(int h = 0; h<l; h++) {
			for(int k = 0; k<=h; k++){
				System.out.print("*");
			}
				System.out.println();
		}
}
	 		 
	 
}
