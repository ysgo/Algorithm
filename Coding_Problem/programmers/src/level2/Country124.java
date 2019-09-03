package level2;

public class Country124 {
	public static void main(String[] args) {
		SolutionCountry124 su = new SolutionCountry124();
//		int n = 1;	// 1
//		int n = 2;	// 2
//		int n = 3;	// 4
//		int n = 4;	// 11
//		int n = 5;	// 12
		int n = 6; // 14
//		int n = 7;	// 21
//		int n = 8;	// 22
//		int n = 9;	// 24
//		int n = 10; // 41
		System.out.println(su.solution(n));
	}
}

class SolutionCountry124 {
	public String solution(int n) {
//		String answer = "";
//		int tmp = 0;
//		while(n > 0) {
//			tmp = n % 3;
//			n /= 3;
//			if(tmp == 0) {
//				n -= 1;
//				tmp = 4;
//			}
//			answer = tmp + answer;
//		}
//		return answer;
		String[] tmp = { "1", "2", "4" };
		String answer = "";

		while (n > 0) {
			answer = tmp[(n - 1) % tmp.length] + answer;
			n = (n - 1) / tmp.length;
		}
		return answer;
	}
}