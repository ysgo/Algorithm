package day6;

import java.util.Scanner;

public class ScannerLab2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// �Էµ� ���ڰ� �� �߿� �ϳ��� 0���ϸ�
		// ù ��° ���ں��� �ٽ� �Է¹ް� �Ѵ�.
		// "���� ���� �Է��ϼ���!!"��� �޽����� ����ϰ�....
		// ù ��° ���ں��� �ٽ� �Է¹ް� �Ѵ�.
		boolean check = true;
		int result = 0;
		int firstNum = 0;
		int secondNum = 0;
		String operator = "";
		while (check) {
			System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
			firstNum = scn.nextInt();
			System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
			secondNum = scn.nextInt();
			if (firstNum > 0 && secondNum > 0) {
				break;
//				System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
//				firstNum = scn.nextInt();
//				System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
//				secondNum = scn.nextInt();
//			} else if(firstNum < 0 || secondNum < 0 ) {
//				System.out.println("���� ���� �Է��ϼ���!!");
//				System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
//				firstNum = scn.nextInt();
//				System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
//				secondNum = scn.nextInt();
			} else {
				System.out.println("���� ���� �Է��ϼ���.");
			}
		}
		System.out.print("������(+, -, *, /)�� �Է��ϼ��� : ");
		operator = scn.next();
		switch (operator) {
		case "+":
			result = firstNum + secondNum;
			break;
		case "-":
			result = firstNum - secondNum;
			break;
		case "/":
			result = firstNum / secondNum;
			break;
		case "*":
			result = firstNum * secondNum;
			break;
		}
		System.out.printf("%d �� %d �� %s ���� ����� %d �Դϴ�.", firstNum, secondNum, operator, result);
		scn.close();
	}
}
