package hard.ifcase;

import java.util.Scanner;

public class Problem126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		String str1;
		int num2;
		if(num <= 1000) {
			str1 = Integer.toBinaryString(num);
			num2 = Integer.parseInt(str1, 8);
		} else {
			str1 = Integer.toOctalString(num);
			num2 = Integer.parseInt(str1, 16);
		}
		System.out.println("첫 번째 : " + str1);
		System.out.println("두 번째 : " + num2);
	}
}