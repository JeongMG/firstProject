package control;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1; // 초기식.
		while(i <= 10) {
			System.out.printf("i의 값은 %d\n", i);
			i++;
		}
		
		boolean run = true;
		int cnt;
		while(run) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if (cnt == 8) {
				run = false; // break 도 가능
			}
		}
		
		System.out.println("끝.");
	}
}
