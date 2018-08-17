package day2_180817;

public class Operator {
	public static void main(String[] args) {
		// 산술 연산자
		int x = 10 + 20; // 덧셈 가능
		String name = "kijung" + "kim"; // 연결 가능
		String info = "result: " + 30 + 10; // 정수를 문자열로 형 변환 후 연결

		System.out.println(x);
		System.out.println(name);
		System.out.println(info);

		int x1 = 50;
		int y = 20;

		System.out.printf("%d\n", (x1 + y));
		System.out.printf("%d\n", (x1 - y));

		// 복합대입 연산자
		x1 += y;
		System.out.println(x);

		// 형변환 연산자
		double weight = 78.34;
		System.out.println((int) weight);

		// 증감연산자
		x = 100;
		System.out.println(x++); // 100, 출력하고 연산
		System.out.println(--x); // 101 - 1, 출력하기전에 연산

		// 비트연산자
		x = 10;
		System.out.println(x * 2 * 2 * 2);
		x = 10;
		System.out.println(x << 3); // x * 2^3
		x = 10;
		System.out.println(x >> 3); // x / 2^3

		// 조건 삼항 연산자
		int a = 2, b = 3, c = 1, max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		System.out.printf("최대값은 %d 이다", max);
	}

}
