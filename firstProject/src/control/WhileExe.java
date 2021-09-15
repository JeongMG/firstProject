package control;

public class WhileExe {
	public static void main(String[] args) {
		// while 구문을 1~10 까지 출력.
		int i = 1;
		boolean run = true;
		while (run) {
			if (i <= 10) {
				System.out.println(i);
				i++;
			} else {
				i = 1;
				run = false;
			}
		}
		
		System.out.println("끝1.");

		run = true;
		while (run) {
			if (i <= 10) {
				if (i % 2 == 0) {
					System.out.println(i);
					i++;
				} else {
					i++;
				}
			} else {
				i = 1;
				run = false;
			}
		}
		System.out.println("끝2.");
		
		run = true;
		while (run) {
			if (i <= 10) {
				if(i%2 == 1) {
					System.out.println(i);
					i++;
				} else {
					i++;
				}
			} else {
				i = 1;
				run = false;
			}
		}
		System.out.println("끝3.");
		
		run = true;
		int sum = 0;
		while(run) {
			if (i <= 10) {
				sum += i;
				i++;
			} else {
				run = false;
				System.out.println(sum);
			}
		}
		System.out.println("끝4.");
	}
}
