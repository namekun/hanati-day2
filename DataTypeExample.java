package day2_180817;

/**
 * �ڹ� ������ ���� �׽�Ʈ
 */

class DataTypeExample {
	public static void main(String[] args) {
		boolean flag = true; // false
		System.out.println(flag);
		// boolean flag2 = 10; // error

		// char
		char x = '\uD55c'; // '��'
		char y = '\uAE00'; // '��'

		System.out.println(x);
		System.out.println(y);

		// �����
		System.out.println("madeon is \nbest\t!\t!\t!");
		System.out.println("\"fucking\" java....");

		// byte, short, int, long
		long money = 50000000L;
		System.out.println(money);
		System.out.println();
		System.out.print(money);
		System.out.println();
		System.out.printf("%d\n", money);

		// float, double
		// float pi = 3.141592;
		float pi = 3.141592F;
		System.out.println(pi);
		double pi_d = 3.141592;
		System.out.println(pi_d);
	}
}