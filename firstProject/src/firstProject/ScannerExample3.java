package firstProject;
import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		// 영어점수입력 :
		// 수학점수입력 :
		// 이름입력 :
		// 홍길동님의 영어, 수학 점수의 합은 ?, 평균은 ? 입니다.
		
		int engScore;
		int mathScore;
		String name;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("영어 점수 입력 : ");
		engScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("수학 점수 입력 : ");
		mathScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("이름 입력 : ");
		name = scn.nextLine();
		
		int sum = engScore + mathScore;
		double avg = (double)sum / 2;
		
		System.out.printf("%s님의 영어, 수학 점수의 합은 %d, 평균은 %f 입니다.%n", name, sum, avg);
		
		boolean pass = sum >= 120;
		
		if(pass) {
			System.out.println(name + "님은 합격입니다.");
		} else {
			System.out.println(name + "님은 불합격입니다.");
		}
	}
}
