package recursive;

import java.util.Scanner;

// 팩토리얼을 재귀적으로 구현하는 클래스
public class Factorial {
	// 양의 정수 n의 팩토리얼을 반환
	static int factorial(int n) {
		if(n > 0)
			return n * factorial(n - 1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		System.out.println(num + "의 팩토리얼은 " + factorial(num) + "입니다.");
		stdIn.close();
	}
}
