package reference;

import java.util.Scanner;

public class pract {
	public static void main(String[] args) {
		// �����Կ� Ű�� �Է� �޴� �޼ҵ�
		// �����Կ� Ű�� BMI�� �����ϴ� �޼ҵ�
		// ���� : �����Կ� Ű (double)

		double[] personinfo = null;
		personinfo = WandH();
		checkBMI(personinfo);
	}

	public static double[] WandH() {
		System.out.println("�����Ը� �Է��Ͻʽÿ� : ");
		Scanner scn = new Scanner(System.in);
		double weight = scn.nextDouble();
		scn.nextLine();
		System.out.println("Ű�� �Է��Ͻʽÿ� : ");
		double height = scn.nextDouble();
		scn.nextLine();
		return new double[] { weight, height };
	}

	public static void checkBMI(double[] dbAry) {
		double bmi = dbAry[0] / dbAry[1] * dbAry[1];

		if (bmi < 18.5) {
			System.out.println("��ü��.");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("���� ü��.");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��.");
		} else if (bmi >= 25) {
			System.out.println("��");
		} else {
			System.out.println("�ǻ�� ����ϼ���.");
		}
	}
}
