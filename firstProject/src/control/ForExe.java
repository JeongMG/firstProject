package control;
import java.util.Scanner;

public class ForExe {
	public static void main(String[] args) {
		// 1~10 ���
		// ��
		
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("��1.");
		
		for(int i=1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("��2.");
		
		for(int i=1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("��3.");
		
		// 1~10 ���� ���� ���ϵ���  => �հ� 55
		// ��4
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��4.");
	}
}
