package day2_180817;

public class ForExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			// i ������ for���ȿ����� ��밡����.
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
