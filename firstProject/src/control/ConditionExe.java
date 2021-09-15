package control;

import java.util.Scanner;

public class ConditionExe {
	public static void main(String[] args) {
		// 두 정수를 60, 70
		// 두 수를 합한 결과 100 넘어서면 합격, 불합격
		// 끝.

		/*
		 * int score1 = 60; int score2 = 70;
		 * 
		 * if(score1 + score2 >= 100) { System.out.println("합격."); } else {
		 * System.out.println("불합격"); }
		 * 
		 * System.out.println("끝.");
		 * 
		 * 
		 * // 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수
		 * 
		 * int num1, num2; Scanner scn = new Scanner(System.in);
		 * System.out.println("숫자를 입력하시오 : "); num1 = scn.nextInt(); scn.nextLine();
		 * 
		 * System.out.println("숫자를 입력하시오 : "); num2 = scn.nextInt(); scn.nextLine();
		 * 
		 * int result = num1 * num2;
		 * 
		 * if(result%2 == 0) { System.out.println("짝수."); } else {
		 * System.out.println("홀수."); }
		 * System.out.println("##########################");
		 * 
		 * // 4...2의 배수 // 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, // 6의 배수는 2와 3의 배수입니다. int
		 * num3; System.out.println("짝홀을 구분할 숫자를 입력하시오 : "); num3 = scn.nextInt();
		 * scn.nextLine();
		 * 
		 * if(num3%2 == 0 && num3%3 == 0) { System.out.println("2와 3의 배수"); } else if
		 * (num3%2 == 0) { System.out.println("2의 배수"); } else if(num3%3 == 0) {
		 * System.out.println("3의 배수"); } else {
		 * System.out.println("2와 3의 배수 모두 아닙니다."); }
		 */

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch 조건문 -> 1이 나왔습니다.
		// 4번 끝

		switch (randomValue) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}

		System.out.println("#####IF문#####");
		int randomScore = (int) (Math.random() * 100);
		if (randomScore >= 90) {
			System.out.println(randomScore + "점 : A학점");
		} else if (randomScore >= 80) {
			System.out.println(randomScore + "점 : B학점");
		} else if (randomScore >= 70) {
			System.out.println(randomScore + "점 : C학점");
		} else if (randomScore >= 60) {
			System.out.println(randomScore + "점 : D학점");
		} else {
			System.out.println(randomScore + "점 : F학점");
		}

		System.out.println("#####SWITCH문#####");
		int randomScore2 = (int) (Math.random() * 100);
		int resultRandomScore2 = randomScore2 % 10;
		switch (resultRandomScore2) {
		case 9:
			System.out.println(randomScore2 + "점 : A학점");
			break;
		case 8:
			System.out.println(randomScore2 + "점 : B학점");
			break;
		case 7:
			System.out.println(randomScore2 + "점 : C학점");
			break;
		case 6:
			System.out.println(randomScore2 + "점 : D학점");
			break;
		default:
			System.out.println(randomScore2 + "점 : F학점");
			break;
		}

	}
}
