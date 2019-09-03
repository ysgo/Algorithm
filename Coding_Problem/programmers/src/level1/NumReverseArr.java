package level1;
/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
 */
public class NumReverseArr {
	public static void main(String[] args) {
		SolutionNumReverseArr su = new SolutionNumReverseArr();
		int n = 12345;
		for(int data : su.solution(n))
			System.out.print(data + " ");
	}
}
class SolutionNumReverseArr {
	  public int[] solution(long n) {
	      String s = "" + n;
	      //int length = Long.toString(n).length();
	      int[] answer = new int[s.length()];
	      for(int i=0; i<answer.length; i++) {
	            answer[i] = (int)(n%10);
	            n /= 10;
	      }
	      return answer;
	  }
	}