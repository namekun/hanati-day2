package day2_180817;

public class WhileExample {

	public static void main(String[] args) {

		int x = 0;

		while (x < 10) { // x�� 10���� ������ while���� ������.
			System.out.println("kosta187th");
			x++;
		}

		x = 0;
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		
		while (x < 101) {
			if(x % 2 == 0) {
				evensum += x;
				sum += x;
			} else {
				oddsum += x;
				sum += x;
			}
			x++;
		}
		System.out.println("sum : " + sum);
		System.out.println("even sum : " + evensum);
		System.out.println("odd sum : " + oddsum);
	
	}

}
