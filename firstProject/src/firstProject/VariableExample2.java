package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// �̸�, ����, ��/����
		int age = 25;
		int myAge = 26;
		String name = "���α�";
		boolean whatAge;
		whatAge = age <= myAge;
		
		// age < ���� => 25�� �̻�
		
		// age > ���� => 25�� ����
		
		if(whatAge) {
			System.out.println(name + "�� 25�� �̻�.");
		}
		
		whatAge = age >= myAge;
		
		if(whatAge) {
			System.out.println(name + "�� 25�� ����.");
		}
		
		System.out.println("end of prog");
	}

}
