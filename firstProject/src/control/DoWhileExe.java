package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		
		// 1 부터 10까지 출력
		int cnt = 1;
		do {
			if(cnt <= 10) {
				System.out.println(cnt);
				cnt++;
			} else {
				break;
			}
		}while(true);
		System.out.println("끝1.\n");
		
		// 짝수만 출력
		cnt = 1;
		do {
			if(cnt%2 == 1) {
				cnt++;
				continue;
			}
			
			if(cnt <= 10) {
				System.out.println(cnt);
				cnt++;
			} else {
				break;
			}
		} while(true);
		System.out.println("끝2.\n");
		
		cnt = 1;
		int sum = 0;
		do {
			if(cnt%2 == 0) {
				cnt++;
				continue;
			}
			
			if(cnt <= 10) {
				sum += cnt;
				cnt++;
			} else {
				System.out.println("1~10까지의 홀수의 합 : " + sum);
				break;
			}
		}while(true);
		System.out.println("끝3.\n");
		
		// 임의의 값을 1~10;
		// sum 값이 100 보다 큰 수가 되었을 때
		// 그 때의 값을 출력 ... 몇번 실행했는지 보여주도록 ...
		
		cnt = 1;
		sum = 0;
		int num;
		do {
			if(sum <= 100) {
				num = (int)(Math.random() * 10) + 1;
				sum += num;
				cnt++;
			} else {
				System.out.println("sum의 최종 값 : "+ sum);
				System.out.println("시행 횟수 : " + cnt);
				break;
			}
		}while (true);
		System.out.println("끝4.\n");	
		
		int cnt2 = 1;
		int sum2 = 0;
		do {
			num = (int)(Math.random() * 10) + 1;
			sum2 += num;
			cnt2++;
		}while(sum2 <= 100);
		System.out.println(sum2);
		System.out.println(cnt2);
	}
}
