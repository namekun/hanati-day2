package day2_180817;

import java.util.Scanner;

public class FunctionMisssion {

	static void printGugudan(int x) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= x; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
			}
			System.out.println();	
		}
		System.out.println("�������� �������ϴ�.");
	}

	public static void main(String[] args) {
		
		System.out.print("���Ͻô� �ܱ��� ������ݴϴ�. ��ȣ�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		printGugudan(g);
	}

}
