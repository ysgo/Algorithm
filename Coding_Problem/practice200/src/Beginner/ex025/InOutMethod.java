package Beginner.ex025;

import java.util.Scanner;

public class InOutMethod {
//Ű����� �Է¹޾� �ֿܼ� ����ϱ�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int choice = scanner.nextInt();
		System.out.println(choice);
		
		System.out.println("�Ǽ��� �Է��ϼ���.");
		double rchoice = scanner.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		String schoice = scanner.next();
		System.out.println(schoice);
	}

}
