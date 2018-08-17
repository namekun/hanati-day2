package day2_180817;

public class ForMission {

	public static void main(String[] args) {
		// 1. *이 차례대로 찍히는 for문 만들어보기

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

		System.out.println();

		// 2. 1번 출력의 역순
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 3. 끝에서부터 *을 하나씩 추가로
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 4. 3번의 역순
		for (int i = 5; i > 0; i--) {
			for (int j = 4; j >= 0; j--) {
				if (i > j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 5. triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 6.역삼각형
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 7. 모래시계
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 8. gugudan
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d, ", i, j, i * j);
			}
			System.out.printf("다음으로 넘어갑니다~\n");
		}
	}

}
