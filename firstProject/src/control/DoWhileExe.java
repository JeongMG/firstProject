package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		
		// 1 ���� 10���� ���
		int cnt = 1;
		do {
			if(cnt <= 10) {
				System.out.println(cnt);
				cnt++;
			} else {
				break;
			}
		}while(true);
		System.out.println("��1.\n");
		
		// ¦���� ���
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
		System.out.println("��2.\n");
		
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
				System.out.println("1~10������ Ȧ���� �� : " + sum);
				break;
			}
		}while(true);
		System.out.println("��3.\n");
		
		// ������ ���� 1~10;
		// sum ���� 100 ���� ū ���� �Ǿ��� ��
		// �� ���� ���� ��� ... ��� �����ߴ��� �����ֵ��� ...
		
		cnt = 1;
		sum = 0;
		int num;
		do {
			if(sum <= 100) {
				num = (int)(Math.random() * 10) + 1;
				sum += num;
				cnt++;
			} else {
				System.out.println("sum�� ���� �� : "+ sum);
				System.out.println("���� Ƚ�� : " + cnt);
				break;
			}
		}while (true);
		System.out.println("��4.\n");	
		
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
