package reference;

public class ForExample {
	public static void main(String[] args) {
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1.");
		
		// 1~10 짝수만 출력..
		
		for(int i = 1; i<=10; i ++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("끝2.");
		
		// 1 ~ 10 홀수만 합산
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("끝3.");
		
		sum = 0;
		// 1~10 sum 값이 20을 넘어서는 그 때의 횟수
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(sum >= 20) {
				System.out.println("횟수 : " + i);
				break;
			}
		}
		System.out.println("끝4.");
	}
}
