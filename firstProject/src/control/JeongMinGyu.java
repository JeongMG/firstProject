package control;

import java.util.Scanner;

public class JeongMinGyu {
	public static void main(String[] args) {
		// �������� �ֻ���(1~6������ ���ڸ� ���� ����)�� ���� ���ߴ� ����.
		// 3ȸ �̳��� ���߸� �¸�, �����߸� �й�.. Ƚ�� �����̴� for��..
		// �¸� Ȥ�� �й� �� ������ �� �Ұųİ� �����. String ���� �޾Ƽ� �غ���.
		
		int diceNum;
		int answer;
		Scanner scn = new Scanner(System.in);
		String newChallenge;

		for (int i = 1; i <= 3; i++) {
			System.out.println("���ڸ� �Է��Ͻÿ� : ");
			answer = scn.nextInt();
			scn.nextLine();
			diceNum = (int) (Math.random() * 6) + 1;

			if (answer == diceNum) {
				System.out.println("�¸�!");
				System.out.println("�絵�� �Ͻðڽ��ϱ�?(y/n) : ");
				newChallenge = scn.nextLine();

				if (newChallenge.equals("y")) {
					i = 0;
				} else if (newChallenge.equals("n")) {
					System.out.println("������ �����մϴ�.");
					break;
				} else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�. �����մϴ�.");
					break;
				}
			} else if (i == 3) {
				System.out.println("�й�...");
				System.out.println("�絵�� �Ͻðڽ��ϱ�?(y/n) : ");
				newChallenge = scn.nextLine();

				if (newChallenge.equals("y")) {
					i = 0;
				} else if (newChallenge.equals("n")) {
					System.out.println("������ �����մϴ�.");
					break;
				} else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�. �����մϴ�.");
					break;
				}
			}
		}
	}
}
