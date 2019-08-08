package practice_problem;
/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
 */
public class NumDecending {
	public static void main(String[] args) {
		SolutionNumDecending su = new SolutionNumDecending();
		int n = 118372;
		System.out.println(su.solution(n));
	}
}
class SolutionNumDecending {
	  public long solution(long n) {
	      String[] str =  String.valueOf(n).split("");
	      for(int i=0; i<str.length-1; i++) {
	          for(int j=i+1; j<str.length; j++) {
	              if(Integer.parseInt(str[i]) < Integer.parseInt(str[j])) {
	                  String tmp = str[i];
	                  str[i] = str[j];
	                  str[j] = tmp;
	              }
	          }
	      }
	      String answer="";
	      for(String data : str)
	          answer += data;
	      return Long.parseLong(answer);
	  }
	}