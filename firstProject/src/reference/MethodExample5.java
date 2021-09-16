package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// 최소값을 구하는 코드
//		int minVal = scores[0];
//		boolean isTrue = false;
//		for(int i = 0; i<scores.length;i++) {
//			isTrue = minVal > scores[i];
//			if(isTrue) {
//				minVal = scores[i];
//			}
//		}
		int minVal = getMinValue(scores);
		
		System.out.println(minVal);

	}

	public static int getMinValue(int[] ary) {
		int minVal = ary[0];
		boolean isTrue = false;
		for(int i = 0; i<ary.length;i++) {
			isTrue = minVal > ary[i];
			if(isTrue) {
				minVal = ary[i];
			}
		}
		return minVal;
	}
}
