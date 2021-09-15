package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);

		// 똑같은 코드를 반복하면 코드가 길어짐 -> 반복문 사용

		System.out.println("=======다시=======");

		cnt = 0;

		for (int i = 1; i <= 5; i++) {
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}

		System.out.println("=======다시2=======");
		int tempValue = 0;
		for (int i = 1; i <= 5; i++) {
			tempValue += (int)(Math.random() * 10) + 1;
			System.out.printf("%d번 째 값: %d\n", i, tempValue);
		}
		System.out.println("sum: " + tempValue);
		System.out.println("반복문 끝");
	}
}
