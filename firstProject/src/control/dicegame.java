package control;
import java.util.Scanner;

public class dicegame {
	public static void main(String[] args) {
		int diceNum;
		int answer;
		Scanner scn = new Scanner(System.in);
		String newChallenge;
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("숫자를 입력하시오 : ");
			answer = scn.nextInt();
			scn.nextLine();
			diceNum = (int) (Math.random() * 6) + 1;
			
			if(answer == diceNum) {
				System.out.println("승리!");
				System.out.println("재도전 하시겠습니까?(y/n) : ");
				newChallenge = scn.nextLine();
				
				if(newChallenge.equals("y")) {
					i = 0;
				} else if(newChallenge.equals("n")) {
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("입력이 잘못되었습니다. 종료합니다.");
					break;
				}
			} else if(i == 3) {
				System.out.println("패배...");
				System.out.println("재도전 하시겠습니까?(y/n) : ");
				newChallenge = scn.nextLine();
				
				if(newChallenge.equals("y")) {
					i = 0;
				} else if(newChallenge.equals("n")) {
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
