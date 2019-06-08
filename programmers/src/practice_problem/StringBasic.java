package practice_problem;

/*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s		return
a234	false
1234	true */
class SolutionStringBasic {
	  public boolean solution(String s) {
	      boolean answer = true;
	      char[] c = new char[s.length()];
	      if(s.length() == 4 || s.length() == 6) {
	    	  for(int i=0; i<s.length(); i++) {
	    		  c[i] = s.charAt(i);
	    		  if(c[i] < 48 || c[i] > 57) {
	    			  answer = false;
	    			  break;
	    		  }
	    	  }
	      } else				
	    	  answer = false;		// s의 길이 제한조건이 완료가 안되어 100점 만족을 안시킴
	      return answer;
	      /* 예외조건으로 문제 해결하는 방법 
	      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
      
      또는 정규표현식으로 문제 해결 
      if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
	       */
	  }
	}
public class StringBasic {
	public static void main(String[] args) {
//		String s = "a234";	// return false;
//		String s = "4555";	// return true;
		String s = "45555";	// return false;
		SolutionStringBasic su = new SolutionStringBasic();
		System.out.println(su.solution(s));
	}
}
