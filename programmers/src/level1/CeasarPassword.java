package practice_problem;
/*어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s		n		result
AB		1		BC
z		1		a
a B z	4		e F d */
public class CeasarPassword {
	public static void main(String[] args) {
		SolutionCaesarPassword su = new SolutionCaesarPassword();
//		String s = "AB";	// BC
//		int n = 1;			
//		String s = "z";		// a
//		int n = 1;
		String s = "a B z";	// e F d
		int n = 4;
		System.out.println(su.solution(s, n));
	}
}
class SolutionCaesarPassword {
	  public String solution(String s, int n) {
//	      String answer = "";
//	      char[] c = s.toCharArray();		
//	      for(int i=0; i<s.length(); i++) {
//	    	  if(c[i] == ' ')
//	    		  c[i] = ' ';
//	    	  else if(c[i] >= 'a' && c[i] <= 'z') {		// Character.isLowerCase(c[i]) 로 소문자 판별가능
//	    		  if(c[i]+n > 'z')						// n = n % 26으로 항상 26보다 작은수 만드는 변수
//	    			  c[i] = (char)(c[i]+n-26);			// c[i] = (char)((c[i] + n - 'a') % 26 + 'a'); 식 가능 
//	    		  else
//	    			  c[i] += n;
//	    	  } else if(c[i] >= 'A' && c[i] <= 'Z') {	// Character.isUpperCase(c[i]) 로 소문자 판별가능
//	    		  if(c[i]+n > 'Z')
//	    			  c[i] = (char)(c[i]+n-26);
//	    		  else
//	    			  c[i] += n;
//	    	  }
//	    	  answer += c[i];
//	      }					// 시간 : 평균 31ms
//	      return answer;
	      
	      // 람다식을 이용하여 만든 단축된 코드 ( 람다식은 참 낯설다 )
	      return s.chars().map(c -> {
	    	  int n2 = n % 26;
	    	  if(c >= 'a' && c <= 'z') {
	    		  return 'a' + (c - 'a' + n2) % 26;
	    	  } else if(c >= 'A' && c <= 'Z') {
	    		  return 'A' + (c - 'A' + n2) % 26;
	    	  } else
	    		  return c;
	      }).mapToObj(c -> String.valueOf((char)c))
	    		  .reduce((a, b) -> a+b).orElse(""); // 시간 : 평균 35ms
	  }
	}
