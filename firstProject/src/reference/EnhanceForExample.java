package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwang" };
		System.out.println(strAry.length);

		strAry[2] = "Hong";

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong")) {
				System.out.println(strAry[i]);
			}
		}
		System.out.println("====�ٽ�====.");
		
		//Enhanced for
		for(String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println("��.");
		
		// �л� 3��. 4.2, 3.5, 2.8
		// �հ踦 ���� �� �ֵ��� ���� ����.
		// ����� ����ؼ� avg ����
		
		double[] stdScores = {4.2, 3.5, 2.8};
		double stdScoresSum = 0;
		double avg;
		
		for(double stdScore : stdScores) {
			stdScoresSum += stdScore;
		}
		
		avg = stdScoresSum / stdScores.length;
		System.out.println("�л� ��� : " + avg + " �Դϴ�");
	}
}
