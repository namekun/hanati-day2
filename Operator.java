package day2_180817;

public class Operator {
	public static void main(String[] args) {
		// ��� ������
		int x = 10 + 20; // ���� ����
		String name = "kijung" + "kim"; // ���� ����
		String info = "result: " + 30 + 10; // ������ ���ڿ��� �� ��ȯ �� ����

		System.out.println(x);
		System.out.println(name);
		System.out.println(info);

		int x1 = 50;
		int y = 20;

		System.out.printf("%d\n", (x1 + y));
		System.out.printf("%d\n", (x1 - y));

		// ���մ��� ������
		x1 += y;
		System.out.println(x);

		// ����ȯ ������
		double weight = 78.34;
		System.out.println((int) weight);

		// ����������
		x = 100;
		System.out.println(x++); // 100, ����ϰ� ����
		System.out.println(--x); // 101 - 1, ����ϱ����� ����

		// ��Ʈ������
		x = 10;
		System.out.println(x * 2 * 2 * 2);
		x = 10;
		System.out.println(x << 3); // x * 2^3
		x = 10;
		System.out.println(x >> 3); // x / 2^3

		// ���� ���� ������
		int a = 2, b = 3, c = 1, max;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		System.out.printf("�ִ밪�� %d �̴�", max);
	}

}
