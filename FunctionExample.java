package day2_180817;

public class FunctionExample {

	// 함수 정의
	static void printMessage(String name, String message) {
		System.out.println("[" + name + "] : " + message);
	}

	static int sum(int x, int y, int z) {
		return x + y + z; // 값을 리턴해서 보내준다.
	}

	// JVM에 의해 최초 실행되는 엔트리포인트 main() 함수
	public static void main(String[] args) {
		// 함수 사용(호출)
		printMessage("kalid", "one more"); // 반환값 없음
		int result = sum(30, 50, 20); // 반환값 있음
		System.out.println(result);
	}

}
