package day2_180817;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		int score = 99;
		System.out.println(score);

		// if
		if (score < 100) {
			System.out.println("100���� �ƴϸ� �� �Ȱ����ϴ�.");
		}

		// if-else
		if (score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// if-else
		if (score % 2 == 0) {
			System.out.println("Even");
			if (score > 50) {
				System.out.println("���� : " + score);
			}
		} else {
			System.out.println("Odd");
		}

		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		if (score >= 90) {
			System.out.println("��");
		} else if (score >= 80) {
			System.out.println("��");
		} else if (score >= 70) {
			System.out.println("��");
		} else if (score >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

	}

}
