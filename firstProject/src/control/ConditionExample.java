package control;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 70;
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		// 90이상 A, 80 B, 70 C 60 D, 그 외 F
		if(score >= 90) {
			System.out.println("A 학점");
		} else if(score >= 80) {
			System.out.println("B 학점");
		} else if(score >= 70) {
			System.out.println("C 학점");
		} else if(score >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}
		
		System.out.println("끝.");
	}
}
