package hard.method;

import java.util.Scanner;

// swap(int num, int i, int j)는 정수 num의 10^i-1번째와 정수10^j-1번째를 바꾸는 메소드이다
// 해당 자리수가 존재하지 않는다면 "실패"를 출력한다.
// Math.pow(a,b)는 a^b를 double형으로 리턴
public class Problem183 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = stdIn.nextInt();
		System.out.print("Enter the i : ");
		int i = stdIn.nextInt();
		System.out.print("Enter the j : ");
		int j = stdIn.nextInt();
		stdIn.close();
		swap(num, i, j);
	}
	
	public static void swap(int num, int i, int j) {
		double n1 = Math.pow(10, i-1);
		double n2 = Math.pow(10, j-1);
		if(num / (int)n1 == 0.0 || num / (int)n2 == 0.0) {
			System.out.println("실패");
		} else {
			String sNum = Integer.toString(num);
			for(int k=0; k<sNum.length(); k++) {
				if(k == i-1) {
					System.out.print(sNum.charAt(j-1));
				} else if(k == j-1) {
					System.out.print(sNum.charAt(i-1));
				} else {
					System.out.print(sNum.charAt(k));
				}
			}
		}		
	}
}
