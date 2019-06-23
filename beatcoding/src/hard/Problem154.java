package hard;

import java.util.Scanner;

public class Problem154 {
	public static void main(String[] args) {
		// 자연수를 입력받아, 각 자리 제외한 나머지 수들의 합 구하기
		// 1425 >> 425 + 125 + 145 + 142 = 837
		// 63572 >> 3572 + 6572 + 6372 + 6352 + 6357 = 29225
		// 추가적으로 시간복잡도(O)를 여기서 산출하는 법 알아보
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int n=1; int num1=0; int num2=0;
		String str = "";
		int result=0;
		while(true) {
			str = "";
			if(n == 1) {
				num1 = num / 10;
				str += "" + num1;
			} else {
				num1 = num / (n * 10);
				num2 = num % n;
				str += "" + num1 + num2;
			}
			result += Integer.parseInt(str);
			n *= 10;
			System.out.println(num1 + " " + num2 + " " + str);
			System.out.println(result);
			if(num1 == 0) {
				break;
			}
		}
		System.out.println(result);
	}
}
