package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "정민규";
		int age = 25;
		
		// 이름은 정민규, 나이는 25
		
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d%n", name, age);
		
		// b1(byte) = 100;
		// b2(byte) = 10;
		// result = b1, b2의 합
		
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		
		System.out.println(result);
		
		// isLarger 
		// result > 0
		
		boolean isLarger = result > 0;
		
		if(isLarger) {
			System.out.println("result는 양수입니다.");
			// 실행문
		} else {
			System.out.println("result는 음수입니다.");
			// 실행문
		}
		
		// 2200000000, 120, 16
		// avg = 120을 16으로 나눈 결과
		
		long l1 = 2200000000L;
		int num1 = 78;
		int num2 = 8;
		
		//double avg = num1 / (double)num2;
		long avg = (l1 + num1 + num2) / 3;
		
		System.out.println(avg);
		
	}
}
