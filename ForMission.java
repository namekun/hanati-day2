package day2_180817;

public class ForMission {

	public static void main(String[] args) {
		// 1. *�� ���ʴ�� ������ for�� ������

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

		System.out.println();

		// 2. 1�� ����� ����
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 3. ���������� *�� �ϳ��� �߰���
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
		// 4. 3���� ����
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
		// 6.���ﰢ��
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
		// 7. �𷡽ð�
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
			System.out.printf("�������� �Ѿ�ϴ�~\n");
		}
	}

}
