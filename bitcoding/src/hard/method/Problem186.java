package hard.method;

import java.util.Scanner;

// 정수의 입력값이 0~9까지 숫자중 각각 한번씩만 사용되었는지 확인하는 함수작성
public class Problem186 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = stdIn.nextInt(); // 152627389 => return false
		if(checkUseOne(num))
			System.out.println("True");
		else
			System.out.println("False");
		stdIn.close();
	}

	static boolean checkUseOne(int n) {
		boolean check = true;
		String num = String.valueOf(n);
		int length = num.length();

		for(int i=0; i<length; i++) {
			char val = num.charAt(i);
			for(int j=0; j<length; j++) {
				if(i == j)
					continue;
				else {
					if(val == num.charAt(j))
						check = false;
				}
			}
		}
		return check;
	}
}
