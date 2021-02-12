package basic;

import java.util.Scanner;

public class Problem117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = Integer.toBinaryString(num);
		System.out.println(str);
		System.out.println(str.charAt(str.length()-2));
		System.out.println(str.charAt(str.length()-5));
		System.out.println((num<<1)&1);
		System.out.println((num<<4)&1);
		sc.close();
	}
}