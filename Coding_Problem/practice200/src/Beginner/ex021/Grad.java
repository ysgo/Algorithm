package Beginner.ex021;

public class Grad {
//정수 타입의 배열 사용하기
	public static void main(String[] args) {
		int[] grade = {90, 80, 89};
		int tot = grade[0] + grade[1] + grade[2];
		int average = tot/3;
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => ", grade[0], grade[1], grade[2]);
		System.out.printf("총점 %d점, 평균 %d점\n", tot, average);
	}

}
