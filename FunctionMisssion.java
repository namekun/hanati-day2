package day2_180817;

import java.util.Scanner;

public class FunctionMisssion {

	static void printGugudan(int x) {
		for (int i = 2; i <= x; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();	
		}
		System.out.println("구구단이 끝났습니다.");
	}

	public static void main(String[] args) {
		
		System.out.print("원하시는 단까지 출력해줍니다. 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		printGugudan(g);
	}

}
