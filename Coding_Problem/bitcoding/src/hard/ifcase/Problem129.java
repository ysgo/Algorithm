package hard.ifcase;

import java.util.Scanner;

public class Problem129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a+b >= 0.5 * a * b) {
			System.out.println("Nice");
		} else {
			System.out.println("Bad");
		}
		
		String result = a+b>=0.5*a*b? "Nice" : "Bad";
		System.out.println(result);
		System.out.println();
		System.out.printf("%d", a*=3);
		sc.close();
	}
}
