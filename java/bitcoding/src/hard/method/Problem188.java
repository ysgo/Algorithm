package hard.method;

import java.util.Scanner;

// 백준 4673번 문제인 셀프넘버와 동일 문제(단, 여기서는 배열 사용 없이)
public class Problem188 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = stdIn.nextInt();
		stdIn.close();
		System.out.println("Number is SelfNumber ? " + itSelf(num));
	}
	static boolean itSelf(int num) {
		boolean itSelf = true;
		for(int i=1; i<num; i++) {
			if(dn(i) == num) {
				itSelf = false;
			}
		}
		return itSelf;
	}
	static int dn(int num) {
		int sum = num;
		int n = 1;
		while(num >= n) {
			int bit_num = num / n % 10;
			sum += bit_num;
			n *= 10;
		}
		return sum;
	}
}
