package firstProject;
import java.util.Scanner;

public class JeongMinGyu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		int test1;
		int test2;
		
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		name = scn.nextLine();
		System.out.println("1 ������ ������ �Է��Ͻÿ�(100�� ����) : ");
		test1 = scn.nextInt();
		scn.nextLine();
		System.out.println("2 ������ ������ �Է��Ͻÿ�(100�� ����) : ");
		test2 = scn.nextInt();
		scn.nextLine();
		
		int testSum = test1 + test2;
		
		if(testSum >= 120) {
			System.out.println(name + "���� ���� ����� �հ��Դϴ�.");
		} else {
			int notpass = 120 - testSum;
			System.out.println(name + "���� ���� ����� ���հ��Դϴ�. " + notpass + "�� �̴��Դϴ�.");
		}
		
		
	}
}
