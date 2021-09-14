package firstProject;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		// 변수: 사용자 입력(10, 20)
		// 10 + 20 = 30
		int num1;
		int num2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 값을 입력하세요...");
		num1 = scn.nextInt();
		scn.nextLine();
		
		System.out.println("두 번째 값을 입력하세요...");
		num2 = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
}
