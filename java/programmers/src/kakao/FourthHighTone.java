package kakao;

public class FourthHighTone {
	public static void main(String[] args) {
		SolutionFourthHighTone su = new SolutionFourthHighTone();
//		int n = 15;			// 1
//		int n = 24;			// 0
		int n = 41; 		// 2
//		int n = 2147483647;	// 1735
		System.out.println(su.solution(n));
	}
}

class SolutionFourthHighTone {
//	static int answer;
	public int solution(int n) {
//		answer = 0;
		int answer = 0;
		answer = highTone(n, 0, answer);
		return answer;
	}
	// answer는 전역변수로 사용하는게 깔끔할 듯. void타입으로
	static int highTone(int n, int tone, int answer) {
		if(Math.pow(3, tone/2) > n) return answer;
		if(n == 3) {
			if (tone == 2)
				answer++;
		} else if(n > 3) {
			if(n % 3 == 0 && tone >= 2) {
				answer = highTone(n / 3, tone - 2, answer);
			}
				answer = highTone(n - 1, tone + 1, answer);
		}
//		System.out.println("n : " + n + ", answer : " + answer);
		return answer;
	}
}