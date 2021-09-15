package control;
import java.util.Scanner;

public class ForExe {
	public static void main(String[] args) {
		// 1~10 출력
		// 끝
		
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("끝1.");
		
		for(int i=1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("끝2.");
		
		for(int i=1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("끝3.");
		
		// 1~10 까지 합을 구하도록  => 합계 55
		// 끝4
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("끝4.");
	}
}
