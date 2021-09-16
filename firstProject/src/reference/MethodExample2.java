package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24, 55); // 메소드 실행.
		int a = 45, b = 77;
		sum(a, b);

		multi(35, 88);

		getArea(3.5);

		int res = getMax(a, b);
		System.out.println(res);

		System.out.println("결과는 : " + divide(5, 3));
	}

	// 두 정수를 입력 받아서 두 수의 합을 console에 보여주는 메소드.
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합: " + sum);
	}

	// 두 정수를 입력 받아서 두 수의 곱을 console에 보여주는 메소드.
	public static void multi(int i1, int i2) {
		int mlt = i1 * i2;
		System.out.println("두 수의 곱: " + mlt);
	}

	// 정사각형 너비를 계산해주는 메소드.
	public static void getArea(double side) {
		double area = side * side;
		System.out.println("정 사각형의 넓이: " + area);
	}

	// 두 수 중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}

	// 두 수를 입력받아서 첫 번째 값 / 두 번째 값으로 나눈 결과
	public static double divide(int a, int b) {
		double div = (double) a / b;
		return div;
	}
}
