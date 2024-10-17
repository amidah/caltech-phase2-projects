package test;

public class Loops {

	public static void main(String[] args) {
		
		// for loop
		System.out.println("For Loop: ");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
//		for(int i = 1; i <= 10; i+=2) {
//			System.out.println(i);
//		}
		
		// while loop
		System.out.println("While Loop: ");
		int a = 1;
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
		
		// do-while
		System.out.println("do-while loop..");
		int b = 1;
		do {
			System.out.println(b);
			b++;
		}while(b <= 10);
	}
}
