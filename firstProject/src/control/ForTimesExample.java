package control;
//import java.util.Scanner;

public class ForTimesExample {
	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//int num = 0;
		
		/*for(int i = 1; i <= 9; i++) {
			if(num == 0) {
				System.out.println("구구단 숫자를 입력하세요 : ");
				num = scn.nextInt();
				scn.nextLine();
				i = 0;
			} else {
				System.out.printf(" %d * %d = %d\n", num, i, (num*i));
			}
		}*/
		
		for(int j = 2; j <= 9; j++) {
			int row = j;
			System.out.println("====" + row + "단====" );
			for (int i = 1; i <= 9; i++) {
				System.out.printf(" %d * %d = %d \n", row, i, (row*i));
			}
		}
	}
}
