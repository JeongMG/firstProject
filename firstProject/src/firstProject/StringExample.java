package firstProject;

public class StringExample {
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		long myAge = age; // 자동 형변환(promotion)
		age = (int) myAge; // 강제 형변환(casting)
		
		// age ="홍길동";
		// name = 20;
		
		System.out.println(name + "의 나이는 " + age + "세 입니다.");
		
		String myName = "정민규";
		int mingyuAge = 26;
		
		System.out.println(myName + "의 나이는 " + mingyuAge + "세 입니다.");
		
	}

}
