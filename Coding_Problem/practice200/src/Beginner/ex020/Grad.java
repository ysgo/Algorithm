package Beginner.ex020;

public class Grad {
//정수 연산하기
	public static void main(String[] args) {
		int kor=90;
		int eng=80;
		int math=89;
		int tot=kor+eng+math;
		int average=tot/3;
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => ", kor, eng, math);
		System.out.printf("총점 %d점, 평균 %d점\n", tot, average);
	}

}
