package day1;

//if ���� ����Ͽ� ������
// 90 ~ 100 ���̸� A���
// 80 ~ 89 ���̸� B���
// 70~79 ���̸� C���
// 60~69 ���̸� D���
// 0~59 ���̸� F���

public class IfTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0~100
		if (score <= 59)
			System.out.println(score + "���� F ���");
		else if (score <= 69)
			System.out.println(score + "���� D ���");
		else if (score <= 79)
			System.out.println(score + "���� C ���");
		else if (score <= 89)
			System.out.println(score + "���� B ���");
		else
			System.out.println(score + "���� A ���");
	}
}
