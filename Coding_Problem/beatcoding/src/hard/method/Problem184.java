package hard.method;

import java.util.Scanner;

// 각 자리수 합이 한자리 될때까지 계산 후 출력
// 1234567 -> 1+2+3+4+5+6+7 = 28 -> 2 + 8 = 10 -> 1 + 0 = 1
public class Problem184 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = stdIn.nextInt();	// 163957986
		while(true) {
			int sum = 0;
			while(num != 0) {	// 각 자리수 출력과 합 구하기
				int tmp = num % 10;
				num /= 10;
				if(num != 0) {
					System.out.print(tmp + " + ");					
				} else 
					System.out.print(tmp + " = ");					
				sum += tmp;
			}
			if(sum < 10) {	// 1자리수 종료
				System.out.println(sum);
				break;
			} else
				System.out.print(sum + " -> ");
			num = sum;
		}
		stdIn.close();
	}
}
