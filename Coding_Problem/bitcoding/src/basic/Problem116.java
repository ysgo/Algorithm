package basic;

import java.util.Scanner;

public class Problem116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		 int n1 = num / 10000;
		 int n2 = (num/10)%10;
		 System.out.println(n1*n2);
		 sc.close();
	}
}
