package hard.ifcase;

import java.util.Scanner;

public class Problem125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if(year % 400 == 0) {		// if문의 순서가 결과값을 바꾼다.  
			System.out.println(year + "년은 윤년입니다.");
		} else if(year % 100 == 0) {
			System.out.println(year + "년은 평년입니다.");			
		} else if(year % 4 == 0) {
			System.out.println(year + "년은 윤년입니다.");			
		}
	}
}