package practice_problem;

/*
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
s			answer
pPoooyY		true
Pyy			false	 */
class SolutionStringIntoPYCount {
    boolean solution(String s) {
    	boolean answer = true;
		s = s.toLowerCase();
		int pCount=0; int yCount=0;		// 변수를 하나만 사용하여 p일경우는 증가, y일 경우는 감소하면 가
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='p')		// 문자열 비교시 equalsIgnoreCase('비교문자')를 쓰면 대소문자 무시하고 비교가능 
				pCount++;
			else if(s.charAt(i)=='y')
				yCount++;
		}
		if(pCount != 0 || yCount !=0 ) {
			if(pCount != yCount)
				answer = false;	
		} else
			answer = false;
		return answer;
		// 람다식 사용 예
		// s.chars().filter(e->'p'==e).count() == s.chars().filter(e->'y'==e).count();
		
		// stream 사용 예
		// long pCnt = Arrays.asList(s.split("")).stream().map(str->str.toUpperCase()).filter(str->str.equals("P")).count();
        // long yCnt = Arrays.asList(s.split("")).stream().map(str->str.toUpperCase()).filter(str->str.equals("Y")).count();
        // return (pCnt==yCnt)?true:false;
    }
}

public class StringIntoPYCount {
	public static void main(String[] args) {
		String s = "pPoooyY";
//		String s = "Pyy";
//		String s = "ab";
		SolutionStringIntoPYCount su = new SolutionStringIntoPYCount();
		System.out.println(su.solution(s));
	}
}
