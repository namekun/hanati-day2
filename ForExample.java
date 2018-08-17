package day2_180817;

public class ForExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			// i 변수는 for문안에서만 사용가능함.
			// block scope
		}

		for (int j = 0; j < 5; j++) {
			for (int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
