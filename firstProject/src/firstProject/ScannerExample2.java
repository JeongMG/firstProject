package firstProject;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		// ����: ����� �Է�(10, 20)
		// 10 + 20 = 30
		int num1;
		int num2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��ϼ���...");
		num1 = scn.nextInt();
		scn.nextLine();
		
		System.out.println("�� ��° ���� �Է��ϼ���...");
		num2 = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
}
