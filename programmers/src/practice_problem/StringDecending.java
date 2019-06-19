package practice_problem;

//import java.util.Arrays;
//import java.util.Collections;

/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s			return
Zbcdefg		gfedcbZ  */
class SolutionStringDecending {
	public String solution(String s) {
		String answer = "";
//	      String[] str = s.split("");
//	      Arrays.sort(str);
//		  Collections.reverse(Arrays.asList(str));
//		  for(String data :str)
//			  answer += data;
//	      return answer;		// 시간 평균 : 32ms
		char[] c = s.toCharArray();
		char tmp=' ';
		for (int i = 0; i<c.length - 1; i++) {
			for (int j = i+1; j<c.length; j++) {
				if(c[i] < c[j]) {
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;			
				}
					//swap(c[i], c[j]);
					System.out.print(c[i]+"" +c[j] + " ");
			}
		}
		for(char data : c)
			answer += data;
		return answer;		 	// 시간 평균 : 28ms
	}
	public static void swap(char i, char j) {	// swap이 안되는 이유를 모르겠음 
		char tmp= ' ';
		if(i < j) {
			tmp = i;
			i = j;
			j = tmp;			
		}
	}
}

public class StringDecending {
	public static void main(String[] args) {
		SolutionStringDecending su = new SolutionStringDecending();
		String str = "Zbcdefg";
		System.out.println(su.solution(str));
	}
}
