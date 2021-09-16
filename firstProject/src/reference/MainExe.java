package reference;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		// 1. �л�������, 2. �л��̸��Է�, 3. ���, 4. ����
		String[] studentName = null;
		
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �Է��ϼ��� : ");
			
			if(choice == 1) {
				int size = createStudent();
				studentName = new String[size];
			} else if (choice == 2) {
				inputName(studentName);
			} else if (choice == 3) {
				outputName(studentName);
			} else if (choice == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("=============================================");
		System.out.println("1. �л� �� ����, 2. �л� �̸� �Է�, 3. ���, 4. ����");
		System.out.println("=============================================");
	}
	
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int num = scn.nextInt();
		return num;
	}
	
	public static String readStr(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		String str = scn.nextLine();
		return str;
	}
	
	public static int createStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ��� : ");
		return cnt;
	}
	
	public static void inputName(String[] str) {
		if (str == null) {
			System.out.println("***���� �л� ���� �̸��� �Է��ϼ���.***");
			return;
		}
		for (int i = 0; i < str.length; i++) {
			str[i] = readStr("�л� �̸��� �Է��ϼ��� : ");
		}
	}
	
	public static void outputName(String[] str) {
		if (str == null) {
			System.out.println("***���� �л� ���� �̸��� �Է��ϼ���.***");
			return;
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println((i+1) + "�� �л� : " + str[i]);
		}
	}
	
	
}
