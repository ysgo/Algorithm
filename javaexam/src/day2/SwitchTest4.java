package day2;

//if ���� ����Ͽ� ������
// 90 ~ 100 ���̸� A���
// 80 ~ 89 ���̸� B���
// 70~79 ���̸� C���
// 60~69 ���̸� D���
// 0~59 ���̸� F���

public class SwitchTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0~100
		//System.out.println(score);
		String grade;
		switch (score/10) {
		case 10 :
		case 9 : 
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
		}
		System.out.println(score + "���� " + grade + " ���");
	}
}
