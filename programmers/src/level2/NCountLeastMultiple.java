package level2;

public class NCountLeastMultiple {
	public static void main(String[] args) {
		SolutionNCountLeastMultiple su = new SolutionNCountLeastMultiple();
//		int[] arr = {2,6,8,14};	// 168
		int[] arr = {1,2,3};	// 6
		System.out.println(su.solution(arr));
	}
}
class SolutionNCountLeastMultiple {
	  public int solution(int[] arr) {
	      int answer = lcd(arr[0], arr[1]);
	      for(int i=2; i<arr.length; i++) {
	    	  answer = lcd(answer, arr[i]);
	      }
	      return answer;
	  }
	  static int gcd(int x, int y) {
		  if(y == 0)
			  return x;
		  else
			  return gcd(y, x % y);
	  }
	  static int lcd(int x, int y) {
		  return (x * y) / gcd(x, y);
	  }
	}