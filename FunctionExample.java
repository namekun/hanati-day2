package day2_180817;

public class FunctionExample {

	// �Լ� ����
	static void printMessage(String name, String message) {
		System.out.println("[" + name + "] : " + message);
	}

	static int sum(int x, int y, int z) {
		return x + y + z; // ���� �����ؼ� �����ش�.
	}

	// JVM�� ���� ���� ����Ǵ� ��Ʈ������Ʈ main() �Լ�
	public static void main(String[] args) {
		// �Լ� ���(ȣ��)
		printMessage("kalid", "one more"); // ��ȯ�� ����
		int result = sum(30, 50, 20); // ��ȯ�� ����
		System.out.println(result);
	}

}
