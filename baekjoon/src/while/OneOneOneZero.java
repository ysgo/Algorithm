import java.util.Scanner;
// while문 연습
public class OneOneOneZero {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n1, n2, sum=0;
		int chkNum=num;
		int newNum=0;
		int cycle=0;
		boolean check = true;
		end : while(check) {
			if(num >= 10) {
				n1 = num / 10; // 첫번째자리
				n2 = num % 10; // 두번째자리
				sum = n1 + n2; // 합
				newNum = n2 * 10 + sum % 10; // 새로운 숫자
				cycle++;
				if(newNum == chkNum) {
					check = false;
					break end;
				} else {
					num = newNum;
				}
			} else { // 10미만일때
				sum = num; // 입력값이 합이 됨
				newNum = num * 10 + sum % 10; // 새로운 숫자는 입력값과 합을 붙인것
				cycle++;
				if(newNum == chkNum) {
					check = false;
					break end;
				} else {
					num = newNum;
				}
			}
		}
		scn.close();
		System.out.println("사이클 수 : " + cycle);
	}
}
