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
			System.out.println("�ش��ϴ� ���� �����ϴ�.");
		}

		int x1 = 70, y = 25;

		System.out.print("�����ڸ� �Է����ּ��� :");
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
			System.out.println("�������� �ʴ� �������Դϴ�.");
		}
	}
}
