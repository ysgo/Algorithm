package level1;
/*
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
입출력 예
a	b	result
5	24	TUE
 */

public class Year2016 {
	public static void main(String[] args) {
		SolutionYear2016 su = new SolutionYear2016();
		System.out.println(su.solution(5, 24));
	}
}
class SolutionYear2016 {
	public String solution(int a, int b) {
		String answer = "";
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 요일계산시 문제이 시작 요일이 주어짐(hint)
		int oper=0;					// 윤년계산 조건은 4로 나누고, 100으로 나누고, 400으로 나누고...(나머지로 파악)
		for(int i=0; i<a-1; i++)
			oper += date[i];
		oper += (b-1);
		switch(oper % 7) {
		case 0:
			answer = "FRI";
			break;
		case 1:
			answer = "SAT";
			break;
		case 2:
			answer = "SUN";
			break;
		case 3:
			answer = "MON";
			break;
		case 4:
			answer = "TUE";
			break;
		case 5:
			answer = "WED";
			break;
		case 6:
			answer = "THU";
			break;
		}
		return answer;
	}
}
