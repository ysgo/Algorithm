package repeat;

import java.util.Scanner;

public class OneZeroNineFiveTwo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while (true) {
			int num1 = stdIn.nextInt();
			int num2 = stdIn.nextInt();
			if (num1 == 0 && num2 == 0)
				break;
			System.out.println(num1 + num2);
		}
		stdIn.close();
	}
}
