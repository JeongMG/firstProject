package control;

import java.util.Scanner;

public class JeongMinGyu {
	public static void main(String[] args) {
		// 랜덤으로 주사위(1~6까지의 숫자를 랜덤 지정)를 굴려 맞추는 게임.
		// 3회 이내에 맞추면 승리, 못맞추면 패배.. 횟수 지정이니 for문..
		// 승리 혹은 패배 시 게임을 또 할거냐고 물어보기. String 값을 받아서 해보기.
		
		int diceNum;
		int answer;
		Scanner scn = new Scanner(System.in);
		String newChallenge;

		for (int i = 1; i <= 3; i++) {
			System.out.println("숫자를 입력하시오 : ");
			answer = scn.nextInt();
			scn.nextLine();
			diceNum = (int) (Math.random() * 6) + 1;

			if (answer == diceNum) {
				System.out.println("승리!");
				System.out.println("재도전 하시겠습니까?(y/n) : ");
				newChallenge = scn.nextLine();

				if (newChallenge.equals("y")) {
					i = 0;
				} else if (newChallenge.equals("n")) {
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("입력이 잘못되었습니다. 종료합니다.");
					break;
				}
			} else if (i == 3) {
				System.out.println("패배...");
				System.out.println("재도전 하시겠습니까?(y/n) : ");
				newChallenge = scn.nextLine();

				if (newChallenge.equals("y")) {
					i = 0;
				} else if (newChallenge.equals("n")) {
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("입력이 잘못되었습니다. 종료합니다.");
					break;
				}
			}
		}
	}
}
