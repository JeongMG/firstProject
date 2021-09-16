package reference;

import java.util.Scanner;

public class pract {
	public static void main(String[] args) {
		// 몸무게와 키를 입력 받는 메소드
		// 몸무게와 키로 BMI를 측정하는 메소드
		// 변수 : 몸무게와 키 (double)

		double[] personinfo = null;
		personinfo = WandH();
		checkBMI(personinfo);
	}

	public static double[] WandH() {
		System.out.println("몸무게를 입력하십시오 : ");
		Scanner scn = new Scanner(System.in);
		double weight = scn.nextDouble();
		scn.nextLine();
		System.out.println("키를 입력하십시오 : ");
		double height = scn.nextDouble();
		scn.nextLine();
		return new double[] { weight, height };
	}

	public static void checkBMI(double[] dbAry) {
		double bmi = dbAry[0] / dbAry[1] * dbAry[1];

		if (bmi < 18.5) {
			System.out.println("저체중.");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("적정 체중.");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중.");
		} else if (bmi >= 25) {
			System.out.println("비만");
		} else {
			System.out.println("의사와 상담하세요.");
		}
	}
}
