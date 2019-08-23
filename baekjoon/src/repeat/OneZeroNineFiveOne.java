package repeat;

import java.util.Scanner;

public class OneZeroNineFiveOne {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while (stdIn.hasNext()) {
			int num1 = stdIn.nextInt();
			int num2 = stdIn.nextInt();
			System.out.println(num1 + num2);
		}
		stdIn.close();
	}
}
