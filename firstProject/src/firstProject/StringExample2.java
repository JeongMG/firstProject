package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "���α�";
		int age = 25;
		
		// �̸��� ���α�, ���̴� 25
		
		System.out.println("�̸��� " + name + ", ���̴� " + age);
		System.out.printf("�̸��� %s, ���̴� %d%n", name, age);
		
		// b1(byte) = 100;
		// b2(byte) = 10;
		// result = b1, b2�� ��
		
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		
		System.out.println(result);
		
		// isLarger 
		// result > 0
		
		boolean isLarger = result > 0;
		
		if(isLarger) {
			System.out.println("result�� ����Դϴ�.");
			// ���๮
		} else {
			System.out.println("result�� �����Դϴ�.");
			// ���๮
		}
		
		// 2200000000, 120, 16
		// avg = 120�� 16���� ���� ���
		
		long l1 = 2200000000L;
		int num1 = 78;
		int num2 = 8;
		
		//double avg = num1 / (double)num2;
		long avg = (l1 + num1 + num2) / 3;
		
		System.out.println(avg);
		
	}
}
