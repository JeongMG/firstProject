package firstProject;
import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		// ���������Է� :
		// ���������Է� :
		// �̸��Է� :
		// ȫ�浿���� ����, ���� ������ ���� ?, ����� ? �Դϴ�.
		
		int engScore;
		int mathScore;
		String name;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� ���� �Է� : ");
		engScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("���� ���� �Է� : ");
		mathScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("�̸� �Է� : ");
		name = scn.nextLine();
		
		int sum = engScore + mathScore;
		double avg = (double)sum / 2;
		
		System.out.printf("%s���� ����, ���� ������ ���� %d, ����� %f �Դϴ�.%n", name, sum, avg);
		
		boolean pass = sum >= 120;
		
		if(pass) {
			System.out.println(name + "���� �հ��Դϴ�.");
		} else {
			System.out.println(name + "���� ���հ��Դϴ�.");
		}
	}
}
