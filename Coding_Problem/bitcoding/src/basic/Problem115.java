package basic;

import java.util.Scanner;

public class Problem115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 char c = (char)('A' + (num-1));
		 char d = (char)(c + 32);
		System.out.println(c+ "\t" + d);
		sc.close();
	}
}
