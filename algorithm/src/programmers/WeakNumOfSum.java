package programmers;

public class WeakNumOfSum {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int n = 5;
		System.out.println(solution.solution(n));
	}
}
/*
 * 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 자연수입니다.
입출력 예
n	return
12	28
5	6
입출력 예 설명
입출력 예 #1
12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

입출력 예 #2
5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
 */
class Solution2 {
	  public int solution(int n) {
//	      int answer = 0;
//	      int a=1;
//	      while(n >= a) {
//	    	  if(n % a == 0)
//	    		 answer += a;
//	    	a++;
//	      }
//	      return answer;	// n번 반복이 비효율
		  
		  int answer=0;
		  for(int i=1; i<=n/2; i++) {
			  if(n % i == 0)
			  	answer += i;			  	
		  }	
		  return answer+n;
	  }
}
