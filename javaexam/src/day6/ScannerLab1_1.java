package day6;

import java.util.Scanner;

public class ScannerLab1_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		String firstNum = scn.nextLine();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		String secondNum = scn.nextLine();
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		String operator = scn.nextLine();
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);
		scn.close();
		int result=0;
		switch(operator) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "/" :
			result = num1 / num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		default :
			break;
		}
		System.out.printf("%d �� %d �� %s ���� ����� %d �Դϴ�.", 
				num1, num2, operator, result);
	}
}
