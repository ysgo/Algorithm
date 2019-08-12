package practice_problem;
/*
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	Odd
4	Even
 */
public class EvenOdd {
	public static void main(String[] args) {
		SolutionEvenOdd su = new SolutionEvenOdd();
		int num = 3;
		System.out.println(su.solution(num));
	}
}
class SolutionEvenOdd {
	  public String solution(int num) {
	      String answer = "";
	      if(num % 2 == 0) {
	          answer = "Even";
	      } else {
	          answer = "Odd";
	      }
	      return answer;
	  }
	}