package basic;

import java.util.Scanner;

public class Problem112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		 String result =Integer.toBinaryString(num*4);
		 System.out.println(result);
		 sc.close();
	}
}
