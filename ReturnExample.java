package day2_180817;

public class ReturnExample {
	public static void main(String[] args) {
		System.out.println("program1 start....");
		
		for(int i = 0; i<100; i++) {
		 System.out.println("when can i go to home?");
		 if(i == 50) {
			 break;
		 }
		}
		System.out.println("program1 end...");
		
		System.out.println("program2 start....");
		
		for(int i = 0; i<100; i++) {
		 System.out.println("when can i go to home?");
		 if(i == 50) {
			 return;
		 }
		}
		System.out.println("program2 end...");
		
	}
}
