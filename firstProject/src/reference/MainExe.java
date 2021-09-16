package reference;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		// 1. 학생수지정, 2. 학생이름입력, 3. 출력, 4. 종료
		String[] studentName = null;
		
		while (true) {
			showMenu();
			int choice = readInt("번호를 입력하세요 : ");
			
			if(choice == 1) {
				int size = createStudent();
				studentName = new String[size];
			} else if (choice == 2) {
				inputName(studentName);
			} else if (choice == 3) {
				outputName(studentName);
			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("=============================================");
		System.out.println("1. 학생 수 지정, 2. 학생 이름 입력, 3. 출력, 4. 종료");
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
		int cnt = readInt("학생 수를 입력하세요 : ");
		return cnt;
	}
	
	public static void inputName(String[] str) {
		if (str == null) {
			System.out.println("***먼저 학생 수와 이름를 입력하세요.***");
			return;
		}
		for (int i = 0; i < str.length; i++) {
			str[i] = readStr("학생 이름을 입력하세요 : ");
		}
	}
	
	public static void outputName(String[] str) {
		if (str == null) {
			System.out.println("***먼저 학생 수와 이름를 입력하세요.***");
			return;
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println((i+1) + "번 학생 : " + str[i]);
		}
	}
	
	
}
