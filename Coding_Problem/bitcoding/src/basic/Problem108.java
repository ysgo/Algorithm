package basic;

import java.util.Scanner;

public class Problem108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean re = (num % 3 == 0) && (num % 4 != 0);
		System.out.println(re);
		sc.close();
	}
}
