package search;


/*
 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers		return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3] */
public class MockTest {	
	static int[] answer = {1,2,3,4,5};
	public static void main(String[] args) {
		SolutionMockTest su = new SolutionMockTest();
		int[] firstPerson = new int[answer.length*2];
		int[] secondPerson = new int[answer.length*2];
		int[] thirdPerson = new int[answer.length*2];

		for(int i=0, j=1; i<firstPerson.length; i++) {
			firstPerson[i] = j++;
			if(firstPerson[i] == 5) {
				j = 1;
			}
		}
		for(int i=0, j=1; i<secondPerson.length; i++) {
			if(i % 2 == 0) {
				secondPerson[i] = 2;				
			} else {
				if(j != 2)
					secondPerson[i] = j++;
				else
					secondPerson[i] = j+1;
				if(j == 6)
					j=1;
			}
		}
//		for(int i=0; i<thirdPerson.length; i++) {
//			
//		}
		
		for(int data : secondPerson)
			System.out.println(data);
	}
	
	static int check(int[] firstPerson, int[] secondPerson, int[] thirdPerson) {
		int result=0;
		int n1=0, n2=0, n3=0;
		for(int i=0; i<firstPerson.length; i++) {
			if(firstPerson[i] == answer[i]) {
				n1++;
			}
		}
		for(int i=0; i<secondPerson.length; i++) {
			if(secondPerson[i] == answer[i]) {
				n2++;
			}
		}
		for(int i=0; i<thirdPerson.length; i++) {
			if(thirdPerson[i] == answer[i]) {
				n3++;
			}
		}
		return result;
	}
}
class SolutionMockTest {
    public int[] solution(int[] answers) {
        int[] answer = {1,2,3,4,5};
//        int[] answer = {1,3,2,4,2};
        return answer;
    }
}
