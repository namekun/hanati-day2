package day2_180817;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		int x = 4;

		switch (x) {
		case 1:
			System.out.println(x);
			break;
		case 2:
			System.out.println(x);
			break;
		case 3:
			System.out.println(x);
			break;
		case 4:
			System.out.println(x);
			break;
		case 5:
			System.out.println(x);
			break;
		default:
			System.out.println("해당하는 값이 없습니다.");
		}

		int x1 = 70, y = 25;

		System.out.print("연산자를 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		String opp = sc.next();

		switch (opp) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		case "%":
			System.out.println(x % y);
			break;
		default:
			System.out.println("지원하지 않는 연산자입니다.");
		}
	}
}
