package control;

import java.util.Scanner;

public class ConditionExe {
	public static void main(String[] args) {
		// �� ������ 60, 70
		// �� ���� ���� ��� 100 �Ѿ�� �հ�, ���հ�
		// ��.

		/*
		 * int score1 = 60; int score2 = 70;
		 * 
		 * if(score1 + score2 >= 100) { System.out.println("�հ�."); } else {
		 * System.out.println("���հ�"); }
		 * 
		 * System.out.println("��.");
		 * 
		 * 
		 * // �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��
		 * 
		 * int num1, num2; Scanner scn = new Scanner(System.in);
		 * System.out.println("���ڸ� �Է��Ͻÿ� : "); num1 = scn.nextInt(); scn.nextLine();
		 * 
		 * System.out.println("���ڸ� �Է��Ͻÿ� : "); num2 = scn.nextInt(); scn.nextLine();
		 * 
		 * int result = num1 * num2;
		 * 
		 * if(result%2 == 0) { System.out.println("¦��."); } else {
		 * System.out.println("Ȧ��."); }
		 * System.out.println("##########################");
		 * 
		 * // 4...2�� ��� // 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, // 6�� ����� 2�� 3�� ����Դϴ�. int
		 * num3; System.out.println("¦Ȧ�� ������ ���ڸ� �Է��Ͻÿ� : "); num3 = scn.nextInt();
		 * scn.nextLine();
		 * 
		 * if(num3%2 == 0 && num3%3 == 0) { System.out.println("2�� 3�� ���"); } else if
		 * (num3%2 == 0) { System.out.println("2�� ���"); } else if(num3%3 == 0) {
		 * System.out.println("3�� ���"); } else {
		 * System.out.println("2�� 3�� ��� ��� �ƴմϴ�."); }
		 */

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch ���ǹ� -> 1�� ���Խ��ϴ�.
		// 4�� ��

		switch (randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}

		System.out.println("#####IF��#####");
		int randomScore = (int) (Math.random() * 100);
		if (randomScore >= 90) {
			System.out.println(randomScore + "�� : A����");
		} else if (randomScore >= 80) {
			System.out.println(randomScore + "�� : B����");
		} else if (randomScore >= 70) {
			System.out.println(randomScore + "�� : C����");
		} else if (randomScore >= 60) {
			System.out.println(randomScore + "�� : D����");
		} else {
			System.out.println(randomScore + "�� : F����");
		}

		System.out.println("#####SWITCH��#####");
		int randomScore2 = (int) (Math.random() * 100);
		int resultRandomScore2 = randomScore2 % 10;
		switch (resultRandomScore2) {
		case 9:
			System.out.println(randomScore2 + "�� : A����");
			break;
		case 8:
			System.out.println(randomScore2 + "�� : B����");
			break;
		case 7:
			System.out.println(randomScore2 + "�� : C����");
			break;
		case 6:
			System.out.println(randomScore2 + "�� : D����");
			break;
		default:
			System.out.println(randomScore2 + "�� : F����");
			break;
		}

	}
}
