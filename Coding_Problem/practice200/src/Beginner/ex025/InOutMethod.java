package Beginner.ex025;

import java.util.Scanner;

public class InOutMethod {
//키보드로 입력받아 콘솔에 출력하기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int choice = scanner.nextInt();
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = scanner.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자를 입력하세요.");
		String schoice = scanner.next();
		System.out.println(schoice);
	}

}
