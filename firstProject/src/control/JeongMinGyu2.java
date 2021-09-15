package control;

public class JeongMinGyu2 {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			int row = j;
			for (int i = 2; i <= 9; i++) {
				if((i * row) < 10) {
					System.out.printf("| %d * %d = %d ", i, row, (i * row));
				} else { 
					System.out.printf("| %d * %d = %d", i, row, (i * row));
				}
			}
			System.out.println();
		}
	}
}
