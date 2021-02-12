package hard.recursive;

import java.util.Scanner;
// 10진수를 2진수로 변환
public class Problem251 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		System.out.println(to_bin(n));
		
		stdIn.close();
	}
	public static String to_bin(int n) {
		if(n == 1) 
			return "1";
		else {
			String tmp = "";
			while(true) {
				tmp += Integer.toString(n % 2);
				n = (n - n % 2) / 2;
				if(n < 2) {
					tmp += Integer.toString(n);
					String answer= "";
					for(int i=0; i<tmp.length(); i++) {
						answer += tmp.charAt(tmp.length() - 1 - i);
					}
					return answer;
				}
			}
		}
	}
}
