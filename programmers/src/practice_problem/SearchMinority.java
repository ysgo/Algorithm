package practice_problem;

/* 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3 */
class SolutionSearchMinority {
	public int solution(int n) {
		int answer=0;
//		boolean bl = true;
//		for(int i=2; i<=n; i++) {
//			for(int j=2; j*j<i; j++) {
//				if(i % j == 0) {
//					bl = false;
//					break;
//				}
//			}
//			if(bl == true)
//				answer++;
//		}					// 정확성 2개 시간 초과, 효율성 제로
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		ar.add(2);
//		for(int i=2; i<=n; i++) {
//			for(int j=0;ar.size()>j; j++) {
//				if(i%ar.get(j)==0) break;		//소수가 아닌 경우
//				if(j+1 == ar.size()) ar.add(i);	//소수일때
//			}
//		}
//		answer = ar.size();			// 정확성 통과, 효율성 제로
		// 에라토스테네스의 체 공식
		int[] number = new int[n+1];
		//2부터 n까지의 수 배열에 삽입
		for(int i=2; i<=n; i++)
			number[i] = i;
		//2부터 시작해 배수들을 0으로 전환
		//이후에 0이면 넘어가고 아니면 그 배수들을 다시 0으로 만듬
		for(int i=2; i<=n; i++) {
			if(number[i] == 0) continue;
			for(int j=2*i; j<=n; j+=i)
				number[j] = 0;
		}
		//배열에서 0이 아닌 수 카운트
		for(int i=0; i<number.length; i++) {
			if(number[i]!=0) answer++;
		}							// 통과 
		return answer;
	}
}
public class SearchMinority {
	public static void main(String[] args) {
		SolutionSearchMinority su = new SolutionSearchMinority();
		int n = 10;
//		int n = 5;
//		int n = 50;
		System.out.println(su.solution(n));
	}
}
