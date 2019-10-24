package level1;
/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
입출력 예
a	b	return
3	5	12
3	3	3
5	3	12 */
class BetweenNumOfSumSolution {
	  public long solution(int a, int b) {
	      long answer = 0;
	      if(a>b) {			// 최대, 최소를 구해서 for문의 처음과 마지막 값을 지정해도 됨 
	    	  int tmp = a;
	    	  a = b;
	    	  b = tmp;
	      }
	      for(int i=a; i<=b; i++) {
	    	  answer += i;
	      }
	      return answer;
	  }
	}
public class BetweenNumOfSum {
	public static void main(String[] args) {
		BetweenNumOfSumSolution su = new BetweenNumOfSumSolution();
		System.out.println(su.solution(3, 5));
		System.out.println(su.solution(3, 3));
		System.out.println(su.solution(5, 3));
	}
}

/*풀이(등차수열의 합 공식 이용시 쉽게 해결됨)
 1. 첫항과 마지막 항을 알 경우 : n(a+l)/2 -> a:첫항, n:더하는것개수, l:마지막 항
 2. 공차를 알 경우 : n(2a+(n-1)d)/2 -> a:첫항, d:공차, n:더하는것개수
 핵심:위의 두 식은 최종적으로 같은 공식임을 기억하자(1식의 l은 a+(n-1)d이기에 대입해보면 같은 식이라는 결론이 나옴)
 */
