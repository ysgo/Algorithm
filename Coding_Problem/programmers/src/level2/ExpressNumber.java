package level2;

public class ExpressNumber {
	public static void main(String[] args) {
		SolutionExpressNumber su = new SolutionExpressNumber();
		int n = 15;
		System.out.println(su.solution(n));
	}
}

class SolutionExpressNumber {
	public int solution(int n) {
		int answer = 1;		// 자기 자신은 무조건 포함
		int sum;			// 누적 수
		int range = n / 2 + 1;	// 연속된 자연수 합으로 자신을 표현하는 범위는 최대 자신의 반의 +1
		
		for(int i=1; i<range; i++) {
			sum = i;
			for(int j=i+1; j <= range && sum < n; j++) {
				sum += j;
				if(sum == n)
					answer ++;
			}
		}
		return answer;
		/* !! 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리 !!
		 *  int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
		 */
	}
}