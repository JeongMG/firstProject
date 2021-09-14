package firstProject;
import java.util.Scanner;

public class JeongMinGyu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		int test1;
		int test2;
		
		System.out.println("이름을 입력하시오 : ");
		name = scn.nextLine();
		System.out.println("1 과목의 점수를 입력하시오(100점 만점) : ");
		test1 = scn.nextInt();
		scn.nextLine();
		System.out.println("2 과목의 점수를 입력하시오(100점 만점) : ");
		test2 = scn.nextInt();
		scn.nextLine();
		
		int testSum = test1 + test2;
		
		if(testSum >= 120) {
			System.out.println(name + "님의 시험 결과는 합격입니다.");
		} else {
			int notpass = 120 - testSum;
			System.out.println(name + "님의 시험 결과는 불합격입니다. " + notpass + "점 미달입니다.");
		}
		
		
	}
}
