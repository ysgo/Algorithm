package day6;

import java.util.Scanner;

public class ScannerLab1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean check = true;
		int result=0;
		end : while(check) {
			System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
			int firstNum = scn.nextInt();
			System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
			int secondNum = scn.nextInt();
			System.out.print("������(+, -, *, /)�� �Է��ϼ��� : ");
			String operator = scn.next();
			switch(operator) {
			case "+" :
				result = firstNum + secondNum;
				break;
			case "-" :
				result = firstNum - secondNum;
				break;
			case "/" :
				result = firstNum / secondNum;
				break;
			case "*" :
				result = firstNum * secondNum;
				break;
			default :
				check = false;
			}
			if(check) {
				System.out.printf("%d �� %d �� %s ���� ����� %d �Դϴ�.", 
						firstNum, secondNum, operator, result);
				break end;
			} else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				check = true;
			}
		}
		scn.close();
	}
}
