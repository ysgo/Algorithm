package level1;

//import java.util.ArrayList;

/*
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 *  각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로,
 *   홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
s					return
try hello world		TrY HeLlO WoRlD */
public class StrangeNumberCreate {
	public static void main(String[] args) {
		SolutionStrangeNumberCreate su = new SolutionStrangeNumberCreate();
		String s = "try hello world"; // reutrn "Try HeLlO WoRlD"
		System.out.println(su.solution(s));
	}
}
class SolutionStrangeNumberCreate {
	public String solution(String s) {
	      String answer = "";
	      int splitIndex=0;
	      StringBuilder sb = new StringBuilder();
	      for(int i=0; i<s.length(); i++) {
	    	  if(s.charAt(i) == ' ') {
	    		  sb.append(' ');
	    		  splitIndex = 0;
	    	  } else {
	    		  if(splitIndex % 2 == 0) {
	    			  sb.append(Character.toUpperCase(s.charAt(i)));
	    			  splitIndex++;
	    		  } else {
	    			  sb.append(Character.toLowerCase(s.charAt(i)));
	    			  splitIndex++;
	    		  }
	    	  }
	      }
	      answer = sb.toString();
// 이상적인 풀이(깔끔한 코딩)
/*
 * int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }	     
 */
	      
// 에러가 발생한 코드(문자열은 StringBuilder가 있다는 것을 생각해 검색후 재코딩) 	      
//	      String[] arr = s.split(" ");
//	      ArrayList<String> list = new ArrayList<>();
//	      for(String data : arr)
//	    	  list.add(data);
//	      int c = 0;
//	      while(c < list.size()) {
//	    	  String tmp = list.get(c);
//	    	  for(int i=0; i<tmp.length(); i++) {
//	    		  if(i % 2 == 0) {
//	    			  if(tmp.charAt(i) >= 97 && tmp.charAt(i) <= 122) {
//	    				  answer += (char)(tmp.charAt(i) - 32);	    				  
//	    			  } else {
//	    				  answer += tmp.charAt(i);
//	    			  }
//	    		  } else if(i % 2 != 0) {
//	    			  if(tmp.charAt(i) >= 65 && tmp.charAt(i) <= 90) {
//	    				  answer += (char)(tmp.charAt(i) + 32);
//	    			  } else {
//	    				  answer += tmp.charAt(i);
//	    			  }
//	    		  }
//	    	  }
//	    	  c++;
//	    	  if(c != list.size())		// 공백일 경우 공백을 추가하는 조건을 세워야했음 
//	    		  answer += " ";		// 바보같이 그냥 공백을 추가해보니 어떤 case에서 에러나는 상황이 있음 
//	      }							// 오류 5개 발생
	      return answer;
	}
}
