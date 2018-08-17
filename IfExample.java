package day2_180817;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		int score = 99;
		System.out.println(score);

		// if
		if (score < 100) {
			System.out.println("100점이 아니면 다 똑같습니다.");
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
				System.out.println("점수 : " + score);
			}
		} else {
			System.out.println("Odd");
		}

		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		if (score >= 90) {
			System.out.println("수");
		} else if (score >= 80) {
			System.out.println("우");
		} else if (score >= 70) {
			System.out.println("미");
		} else if (score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

	}

}
