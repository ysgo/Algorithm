package practice_problem;
/*
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 *  예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	수박수박
 */
public class Subacksu {
	public static void main(String[] args) {
		SolutionSubacksu su = new SolutionSubacksu();
		int n = 3;
//		int n = 4;
		System.out.println(su.solution(n));
	}
}
class SolutionSubacksu {
	  public String solution(int n) {
	      String answer = "";
	      int count=0;
	      while(count < n) {
	          if(count % 2 == 0) {
	              answer += "수";
	          } else {
	              answer += "박";
	          }
	          count++;
	      }
	      return answer;
	  }
	}