package day2_180817;

public class BreakExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("출력: " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("출력: " + i);
		}
		
		STOP:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "," + j);
				if (j == 5) {
					break STOP;
				}
			}
		}
	}
}
